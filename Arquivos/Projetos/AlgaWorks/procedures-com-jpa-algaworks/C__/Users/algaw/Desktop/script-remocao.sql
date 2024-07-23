
    alter table configuracao 
       drop 
       foreign key fk_configuracao_usuario

    alter table usuario 
       drop 
       foreign key fk_usuario_dominio

    alter table usuario_grupo 
       drop 
       foreign key fk_usuario_grupo_grupo

    alter table usuario_grupo 
       drop 
       foreign key fk_usuario_grupo_usuario

    drop table if exists configuracao

    drop table if exists dominio

    drop table if exists grupo

    drop table if exists usuario

    drop table if exists usuario_grupo

    alter table configuracao 
       drop 
       foreign key fk_configuracao_usuario

    alter table usuario 
       drop 
       foreign key fk_usuario_dominio

    alter table usuario_grupo 
       drop 
       foreign key fk_usuario_grupo_grupo

    alter table usuario_grupo 
       drop 
       foreign key fk_usuario_grupo_usuario

    drop table if exists configuracao

    drop table if exists dominio

    drop table if exists grupo

    drop table if exists usuario

    drop table if exists usuario_grupo
