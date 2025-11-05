SELECT p.product_id, COALESCE(ROUND(SUM(price * units) / SUM(units)::numeric,2),0) AS average_price
FROM Prices p LEFT JOIN UnitsSold u ON p.product_id = u.product_id AND purchase_date >= start_date AND purchase_date <= end_date
GROUP BY p.product_id;