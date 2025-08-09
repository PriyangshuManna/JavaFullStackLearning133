CREATE OR REPLACE PROCEDURE TransferFunds(
    p_source_acc   IN NUMBER,
    p_target_acc   IN NUMBER,
    p_amount       IN NUMBER
)
AS
    v_source_balance NUMBER;
BEGIN
    -- Check if source account exists and get its balance
    SELECT balance
    INTO v_source_balance
    FROM accounts
    WHERE account_id = p_source_acc
    FOR UPDATE;  -- Locks the row for transaction safety

    -- Ensure sufficient balance
    IF v_source_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
    END IF;

    -- Deduct from source account
    UPDATE accounts
    SET balance = balance - p_amount
    WHERE account_id = p_source_acc;

    -- Add to target account
    UPDATE accounts
    SET balance = balance + p_amount
    WHERE account_id = p_target_acc;

    DBMS_OUTPUT.PUT_LINE('Transfer of ' || p_amount || ' completed from account '
                         || p_source_acc || ' to account ' || p_target_acc);
END;
/
