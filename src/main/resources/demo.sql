--新建数据库 user_0 和user_1 分别建下面两张表
CREATE TABLE `user_info_0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(19) DEFAULT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `account` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

CREATE TABLE `user_info_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(19) DEFAULT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `account` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
