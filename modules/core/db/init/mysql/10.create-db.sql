-- begin DEVRA_TASK
create table DEVRA_TASK (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    DESC_ longtext,
    JIRA_LINK varchar(255),
    JIRA_TASK_NUMBER varchar(255),
    TYPE_ integer,
    STATUS integer,
    TESTER varchar(255),
    --
    primary key (ID)
)^
-- end DEVRA_TASK
