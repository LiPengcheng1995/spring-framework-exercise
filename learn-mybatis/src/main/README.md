建表语句
```` mysql
use learn;
CREATE TABLE `form`
(
    `form_id`       bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `create_time`   timestamp           NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `creator`       varchar(50)              DEFAULT NULL COMMENT '创建人',
    `is_deleted`    tinyint(1)               DEFAULT NULL COMMENT '是否删除：[(1, 已删除), (0, 未删除)]',
    `modifier`      varchar(50)              DEFAULT NULL COMMENT '修改人',
    `update_time`   timestamp           NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `business_id`   bigint(20) unsigned      DEFAULT NULL COMMENT 'business 主键',
    `form_name`     varchar(45)              DEFAULT NULL COMMENT '批次信息',
    `template_id`   bigint(20)               DEFAULT NULL COMMENT '批次对应的模板信息',
    `creation_code` varchar(255)             DEFAULT NULL COMMENT '创建标识',
    PRIMARY KEY (`form_id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 722351
  DEFAULT CHARSET = utf8 COMMENT ='记录表单批次信息'
````