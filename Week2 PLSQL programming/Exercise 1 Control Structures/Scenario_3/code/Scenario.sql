SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT c.customer_id,
               c.name1,
               l.loan_id,
               l.due_date
        FROM customers_vip c
        JOIN loans l
          ON c.customer_id = l.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' || rec.name1 ||
            ', your loan ID ' || rec.loan_id ||
            ' is due on ' || TO_CHAR(rec.due_date, 'DD-MON-YYYY') ||
            '. Please make payment before the due date.'
        );
    END LOOP;
END;
/
