-- 코드를 입력하세요
SELECT
    -- 도서ID
    -- 출판일
    BOOK_ID,
    DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK
WHERE 
    -- 출판일 2021년
    YEAR(PUBLISHED_DATE) = '2021'
    -- 카테고리 인문
    AND CATEGORY = '인문'
ORDER BY 
    -- 출판일 기준 오름차 순
    PUBLISHED_DATE;