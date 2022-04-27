FROM mariadb:10.3

COPY ../populate.sql /docker-entrypoint-initdb.d