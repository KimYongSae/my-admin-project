

INSERT INTO board (user_id, title, content)
SELECT 
    'test', 
    'Title ' || LEVEL, 
    'Content for post ' || LEVEL
    
FROM dual
CONNECT BY LEVEL <= 100;
