-- 코드를 입력하세요
SELECT CONCAT('/home/grep/src/',t1.BOARD_ID, '/', t2.FILE_ID, t2.FILE_NAME,  t2.FILE_EXT) AS FILE_PATH
FROM USED_GOODS_BOARD t1
INNER JOIN USED_GOODS_FILE t2
ON t1.BOARD_ID = t2.BOARD_ID
WHERE VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
ORDER BY t2.FILE_ID DESC;