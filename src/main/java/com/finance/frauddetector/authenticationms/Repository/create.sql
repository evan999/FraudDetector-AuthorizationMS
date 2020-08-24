CREATE TABLE users
(
    id BIGSERIAL PRIMARY KEY,
    name varchar(40) NOT NULL,
    username varchar(50) NOT NULL,
    email varchar(40) NOT NULL,
    password varchar(60) NOT NULL,
    created_at timestamptz DEFAULT now(),
    CONSTRAINT users_pkey PRIMARY KEY(id),
    CONSTRAINT users_email_key UNIQUE(email),
    CONSTRAINT users_username_key UNIQUE(username)
);

CREATE TABLE user_roles
(
    id BIGSERIAL PRIMARY KEY,
    role_id bigint NOT NULL,
    PRIMARY KEY('user_id', 'role_id'),


)
