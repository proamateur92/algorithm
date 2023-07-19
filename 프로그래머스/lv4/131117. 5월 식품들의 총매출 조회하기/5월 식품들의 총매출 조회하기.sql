# FOOD_PRODUCT 식품정보
# 아이디, 식품명, 식품코드, 식품분류, 식품가격

# FOOD_ORDER 주문정보
# 아이디, 식품아이디, 주문량, 생산일자, 입고일자, 출고일자, 공장 ID, 창고 ID

# 생산일자가 2022년 5월인 식품들의 식품 ID, 식품 이름, 총매출을 조회
# 총매출을 기준으로 내림차순 정렬
# 총매출이 같다면 식품 ID를 기준으로 오름차순 정렬 

SELECT P.PRODUCT_ID, P.PRODUCT_NAME, SUM(P.PRICE * O.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT P
INNER JOIN FOOD_ORDER O
ON P.PRODUCT_ID = O.PRODUCT_ID
WHERE DATE_FORMAT(O.PRODUCE_DATE, '%Y-%m') = '2022-05'
GROUP BY P.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, P.PRODUCT_ID;