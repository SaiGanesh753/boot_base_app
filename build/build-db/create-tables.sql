--Config table
CREATE TABLE config (
	config_id int8 NOT NULL,
	active_flg bool NOT NULL,
	config_key varchar(255) NOT NULL,
	config_value varchar(255) NOT NULL,
	description varchar(255) NULL,
	CONSTRAINT config_pkey PRIMARY KEY (config_id)
);

--Reg_Role table
CREATE TABLE reg_role (
	reg_role_id bigserial NOT NULL,
	active_flg bool NOT NULL,
	role_desc varchar(255) NULL,
	role_name varchar(255) NOT NULL,
	CONSTRAINT reg_role_pkey PRIMARY KEY (reg_role_id)
);