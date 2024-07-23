insert into dominio(id, nome) values (1, 'Banco de Dados');
insert into dominio(id, nome) values (2, 'LDAP');

insert into usuario(id, nome, login, senha, dominio_id, ultimo_acesso) values (1, 'Cal Lightman', 'cal', '123', 1, sysdate());
insert into usuario(id, nome, login, senha, dominio_id, ultimo_acesso) values (2, 'Gillian Foster', 'gillian', '123', 1, sysdate());
insert into usuario(id, nome, login, senha, dominio_id, ultimo_acesso) values (3, 'Ria Torres', 'ria', '123', 1, sysdate());
insert into usuario(id, nome, login, senha, dominio_id, ultimo_acesso) values (4, 'Eli Locker', 'eli', '123', 1, sysdate());
insert into usuario(id, nome, login, senha, dominio_id, ultimo_acesso) values (5, 'Emily Lightman', 'emily', '123', 1, sysdate());

insert into configuracao (usuario_id, receber_notificacoes, encerrar_sessao_automatica) values (1, false, false);

INSERT INTO cliente (cliente_id, cliente_nome) values (1, 'Casas Bahia');
INSERT INTO cliente (cliente_id, cliente_nome) values (2, 'EletroPaulo');
INSERT INTO cliente (cliente_id, cliente_nome) values (3, 'Moe´s bar');

INSERT INTO  funcionario (id, versao, nome, salario, bancoDeHoras, valorHoraExtra) VALUES (1, 0, 'Cal Lightman', 5000, 20,100);

INSERT INTO artigo (id, titulo, conteudo) VALUES (1, 'Titulo do artigo', 'Conteúdo do artigo');