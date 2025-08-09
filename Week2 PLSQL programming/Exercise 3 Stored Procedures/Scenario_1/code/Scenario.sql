CREATE OR REPLACE PROCEDURE promote_vip IS
BEGIN
    FOR rec IN (
        SELECT customer_id
        FROM customers_vip
        WHERE balance > 10000
    )
    LOOP
        UPDATE customers_vip
        SET isvip = 'Y'
        WHERE customer_id = rec.customer_id;
    END LOOP;

    COMMIT;
END;
/
