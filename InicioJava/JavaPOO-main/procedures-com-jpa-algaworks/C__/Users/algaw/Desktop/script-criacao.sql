
    create table configuracao (
       usuario_id integer not null,
        encerrar_sessao_automaticamente bit not null,
        receber_notificacoes bit not null,
        primary key (usuario_id)
    ) engine=InnoDB

    create table dominio (
       id integer not null,
        nome varchar(100) not null,
        primary key (id)
    ) engine=InnoDB

    create table grupo (
       id integer not null,
        nome varchar(100) not null,
        primary key (id)
    ) engine=InnoDB

    create table usuario (
       id integer not null,
        login varchar(50) not null,
        nome varchar(100) not null,
        senha varchar(100),
        ultimo_acesso datetime(6),
        dominio_id integer not null,
        primary key (id)
    ) engine=InnoDB

    create table usuario_grupo (
       usuario_id integer not null,
        grupo_id integer not null
    ) engine=InnoDB

    alter table dominio 
       add constraint un_nome unique (nome)

    alter table grupo 
       add constraint un_nome unique (nome)
create index id_nome on usuario (nome)

    alter table usuario 
       add constraint un_login unique (login)

    alter table configuracao 
       add constraint fk_configuracao_usuario 
       foreign key (usuario_id) 
       references usuario (id)

    alter table usuario 
       add constraint fk_usuario_dominio 
       foreign key (dominio_id) 
       references dominio (id)

    alter table usuario_grupo 
       add constraint fk_usuario_grupo_grupo 
       foreign key (grupo_id) 
       references grupo (id)

    alter table usuario_grupo 
       add constraint fk_usuario_grupo_usuario 
       foreign key (usuario_id) 
       references usuario (id)

    create table configuracao (
       usuario_id integer not null,
        encerrar_sessao_automaticamente bit not null,
        receber_notificacoes bit not null,
        primary key (usuario_id)
    ) engine=InnoDB

    create table dominio (
       id integer not null,
        nome varchar(100) not null,
        primary key (id)
    ) engine=InnoDB

    create table grupo (
       id integer not null,
        nome varchar(100) not null,
        primary key (id)
    ) engine=InnoDB

    create table usuario (
       id integer not null,
        login varchar(50) not null,
        nome varchar(100) not null,
        senha varchar(100),
        ultimo_acesso datetime(6),
        dominio_id integer not null,
        primary key (id)
    ) engine=InnoDB

    create table usuario_grupo (
       usuario_id integer not null,
        grupo_id integer not null
    ) engine=InnoDB

    alter table dominio 
       add constraint un_nome unique (nome)

    alter table grupo 
       add constraint un_nome unique (nome)
create index id_nome on usuario (nome)

    alter table usuario 
       add constraint un_login unique (login)

    alter table configuracao 
       add constraint fk_configuracao_usuario 
       foreign key (usuario_id) 
       references usuario (id)

    alter table usuario 
       add constraint fk_usuario_dominio 
       foreign key (dominio_id) 
       references dominio (id)

    alter table usuario_grupo 
       add constraint fk_usuario_grupo_grupo 
       foreign key (grupo_id) 
       references grupo (id)

    alter table usuario_grupo 
       add constraint fk_usuario_grupo_usuario 
       foreign key (usuario_id) 
       references usuario (id)
