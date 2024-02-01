-- - Create user for database
CREATE USER 'appuser'@'%' IDENTIFIED BY 'appuser@2022';
GRANT ALL PRIVILEGES ON *.* TO 'appuser'@'%' WITH GRANT OPTION;

FLUSH PRIVILEGES;
