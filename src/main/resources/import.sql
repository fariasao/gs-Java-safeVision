-- INSERTS para a popula��o das tabelas
-- INSERTS tb_sv_dependente
INSERT INTO tb_sv_dependente (nome_dependente, rg_dependente, data_nascimento, sexo_dependente) VALUES ('Laura Silva', 123456789, TO_DATE('2012-02-01', 'YYYY-MM-DD'), 'Feminino'); --(Filha de Joana Silva)
INSERT INTO tb_sv_dependente (nome_dependente, rg_dependente, data_nascimento, sexo_dependente) VALUES ('Pedro Oliveira', 987654321, TO_DATE('2009-12-15', 'YYYY-MM-DD'), 'Masculino'); --(Filho de Carlos Oliveira)
INSERT INTO tb_sv_dependente (nome_dependente, rg_dependente, data_nascimento, sexo_dependente) VALUES ('Sofia Santos', 555555555, TO_DATE('2015-10-20', 'YYYY-MM-DD'), 'Feminino'); --(Filha de Maria Santos)
INSERT INTO tb_sv_dependente (nome_dependente, rg_dependente, data_nascimento, sexo_dependente) VALUES ('Gabriel Souza', 111111114, TO_DATE('2013-05-05', 'YYYY-MM-DD'), 'Masculino'); --(Filho de Rafael Souza)
INSERT INTO tb_sv_dependente (nome_dependente, rg_dependente, data_nascimento, sexo_dependente) VALUES ('Ana Julia Almeida', 999999905, TO_DATE('2012-12-12', 'YYYY-MM-DD'), 'Feminino'); --(Filha de Isabela Almeida)
INSERT INTO tb_sv_dependente (nome_dependente, rg_dependente, data_nascimento, sexo_dependente) VALUES ('Matheus Lima', 777777777, TO_DATE('2017-08-03', 'YYYY-MM-DD'), 'Masculino'); --(Filho de Felipe Lima)
INSERT INTO tb_sv_dependente (nome_dependente, rg_dependente, data_nascimento, sexo_dependente) VALUES ('Amanda Pereira', 888888807, TO_DATE('1998-04-15', 'YYYY-MM-DD'), 'Feminino');
INSERT INTO tb_sv_dependente (nome_dependente, rg_dependente, data_nascimento, sexo_dependente) VALUES ('Lucas Mendes', 444444444, TO_DATE('1989-11-11', 'YYYY-MM-DD'), 'Masculino');
INSERT INTO tb_sv_dependente (nome_dependente, rg_dependente, data_nascimento, sexo_dependente) VALUES ('Juliana Rocha', 666666669, TO_DATE('1997-07-07', 'YYYY-MM-DD'), 'Feminino');
INSERT INTO tb_sv_dependente (nome_dependente, rg_dependente, data_nascimento, sexo_dependente) VALUES ('Caio Costa', 332233225, TO_DATE('1944-06-30', 'YYYY-MM-DD'), 'Masculino'); -- (pai de Thiago Costa)

-- INSERTS tb_sv_paciente
INSERT INTO tb_sv_paciente (id_dependente, nome_paciente, email_paciente, senha_paciente, telefone_paciente, data_nascimento) VALUES (1, 'Joana Silva', 'joana.silva@gmail.com', 'senha1', 12345678901, TO_DATE('1981-07-24', 'YYYY-MM-DD'));
INSERT INTO tb_sv_paciente (id_dependente, nome_paciente, email_paciente, senha_paciente, telefone_paciente, data_nascimento) VALUES (2, 'Carlos Oliveira', 'carlos.oliveira@gmail.com', 'senha2', 98765432102, TO_DATE('1978-10-20', 'YYYY-MM-DD'));
INSERT INTO tb_sv_paciente (id_dependente, nome_paciente, email_paciente, senha_paciente, telefone_paciente, data_nascimento) VALUES (3, 'Maria Santos', 'maria.santos@gmail.com', 'senha3', 55555555503, TO_DATE('1985-04-02', 'YYYY-MM-DD'));
INSERT INTO tb_sv_paciente (id_dependente, nome_paciente, email_paciente, senha_paciente, telefone_paciente, data_nascimento) VALUES (4, 'Rafael Souza', 'rafael.souza@gmail.com', 'senha4', 11111111104, TO_DATE('1980-01-05', 'YYYY-MM-DD'));
INSERT INTO tb_sv_paciente (id_dependente, nome_paciente, email_paciente, senha_paciente, telefone_paciente, data_nascimento) VALUES (5, 'Isabela Almeida', 'isabela.almeida@gmail.com', 'senha5', 99999999905, TO_DATE('1982-09-08', 'YYYY-MM-DD'));
INSERT INTO tb_sv_paciente (id_dependente, nome_paciente, email_paciente, senha_paciente, telefone_paciente, data_nascimento) VALUES (6, 'Felipe Lima', 'felipe.lima@gmail.com', 'senha6', 77777777706, TO_DATE('1977-09-12', 'YYYY-MM-DD'));
INSERT INTO tb_sv_paciente (id_dependente, nome_paciente, email_paciente, senha_paciente, telefone_paciente, data_nascimento) VALUES (7, 'Amanda Pereira', 'amanda.pereira@gmail.com', 'senha7', 88888888807, TO_DATE('1998-04-15', 'YYYY-MM-DD'));
INSERT INTO tb_sv_paciente (id_dependente, nome_paciente, email_paciente, senha_paciente, telefone_paciente, data_nascimento) VALUES (8, 'Lucas Mendes', 'lucas.mendes@gmail.com', 'senha8', 44444444408, TO_DATE('1989-11-11', 'YYYY-MM-DD'));
INSERT INTO tb_sv_paciente (id_dependente, nome_paciente, email_paciente, senha_paciente, telefone_paciente, data_nascimento) VALUES (9, 'Juliana Rocha', 'juliana.rocha@gmail.com', 'senha9', 66666666609, TO_DATE('1997-07-07', 'YYYY-MM-DD'));
INSERT INTO tb_sv_paciente (id_dependente, nome_paciente, email_paciente, senha_paciente, telefone_paciente, data_nascimento) VALUES (10, 'Thiago Costa', 'thiago.costa@gmail.com', 'senha10', 22222222210, TO_DATE('1986-08-15', 'YYYY-MM-DD'));

-- INSERTS tb_sv_convenio
INSERT INTO tb_sv_convenio (nome_convenio, telefone_convenio) VALUES ('Bradesco Sa�de', 1112223334);
INSERT INTO tb_sv_convenio (nome_convenio, telefone_convenio) VALUES ('SulAm�rica', 5556667778);
INSERT INTO tb_sv_convenio (nome_convenio, telefone_convenio) VALUES ('Unimed', 9998887776);
INSERT INTO tb_sv_convenio (nome_convenio, telefone_convenio) VALUES ('Amil', 3332221110);
INSERT INTO tb_sv_convenio (nome_convenio, telefone_convenio) VALUES ('Porto Seguro', 4445556667);
INSERT INTO tb_sv_convenio (nome_convenio, telefone_convenio) VALUES ('Blue Med Sa�de', 7778889990);
INSERT INTO tb_sv_convenio (nome_convenio, telefone_convenio) VALUES ('NotreDame Interm�dica', 1234567890);
INSERT INTO tb_sv_convenio (nome_convenio, telefone_convenio) VALUES ('Ameplan', 9876543210);
INSERT INTO tb_sv_convenio (nome_convenio, telefone_convenio) VALUES ('S�o Miguel Sa�de', 4567890123);
INSERT INTO tb_sv_convenio (nome_convenio, telefone_convenio) VALUES ('Prevent Senior', 6543210987);

-- INSERTS tb_sv_plano
INSERT INTO tb_sv_plano (id_convenio, plano_convenio) VALUES (1, 'Sa�de Top');
INSERT INTO tb_sv_plano (id_convenio, plano_convenio) VALUES (2, 'Sa�de Mid');
INSERT INTO tb_sv_plano (id_convenio, plano_convenio) VALUES (3, 'Sa�de Base');
INSERT INTO tb_sv_plano (id_convenio, plano_convenio) VALUES (4, 'Super Sa�de');
INSERT INTO tb_sv_plano (id_convenio, plano_convenio) VALUES (5, 'B�sico');
INSERT INTO tb_sv_plano (id_convenio, plano_convenio) VALUES (6, 'Sa�de Ultra');
INSERT INTO tb_sv_plano (id_convenio, plano_convenio) VALUES (7, 'Sa�de Pronto');
INSERT INTO tb_sv_plano (id_convenio, plano_convenio) VALUES (8, 'Sa�de I');
INSERT INTO tb_sv_plano (id_convenio, plano_convenio) VALUES (9, 'Sa�de Low');
INSERT INTO tb_sv_plano (id_convenio, plano_convenio) VALUES (10, 'Direito Sa�de');

-- INSERTS tb_sv_paciente_convenio
INSERT INTO tb_sv_paciente_convenio (id_paciente, id_plano) VALUES (1, 1);
INSERT INTO tb_sv_paciente_convenio (id_paciente, id_plano) VALUES (2, 2);
INSERT INTO tb_sv_paciente_convenio (id_paciente, id_plano) VALUES (3, 3);
INSERT INTO tb_sv_paciente_convenio (id_paciente, id_plano) VALUES (4, 4);
INSERT INTO tb_sv_paciente_convenio (id_paciente, id_plano) VALUES (5, 5);
INSERT INTO tb_sv_paciente_convenio (id_paciente, id_plano) VALUES (6, 6);
INSERT INTO tb_sv_paciente_convenio (id_paciente, id_plano) VALUES (7, 7);
INSERT INTO tb_sv_paciente_convenio (id_paciente, id_plano) VALUES (8, 8);
INSERT INTO tb_sv_paciente_convenio (id_paciente, id_plano) VALUES (9, 9);
INSERT INTO tb_sv_paciente_convenio (id_paciente, id_plano) VALUES (10, 10);

-- INSERTS tb_sv_imagens
INSERT INTO tb_sv_imagens (id_paciente, data_arquivo, caminho_arquivos, observacoes) VALUES (1, TO_DATE('2023-01-01', 'YYYY-MM-DD'), '/imagens/pacientes/paciente1/imagem1', 'Paciente com retinoblastoma.');
INSERT INTO tb_sv_imagens (id_paciente, data_arquivo, caminho_arquivos, observacoes) VALUES (2, TO_DATE('2023-02-02', 'YYYY-MM-DD'), '/imagens/pacientes/paciente2/imagem2', 'Paciente com retinoblastoma.');
INSERT INTO tb_sv_imagens (id_paciente, data_arquivo, caminho_arquivos, observacoes) VALUES (3, TO_DATE('2023-03-03', 'YYYY-MM-DD'), '/imagens/pacientes/paciente3/imagem3', 'Paciente com suspeita de retinoblastoma.');
INSERT INTO tb_sv_imagens (id_paciente, data_arquivo, caminho_arquivos, observacoes) VALUES (4, TO_DATE('2023-04-04', 'YYYY-MM-DD'), '/imagens/pacientes/paciente4/imagem4', 'Paciente com baixas suspeitas de retinoblastoma.');
INSERT INTO tb_sv_imagens (id_paciente, data_arquivo, caminho_arquivos, observacoes) VALUES (5, TO_DATE('2023-05-05', 'YYYY-MM-DD'), '/imagens/pacientes/paciente5/imagem5', 'Paciente com suspeita de retinoblastoma.');
INSERT INTO tb_sv_imagens (id_paciente, data_arquivo, caminho_arquivos, observacoes) VALUES (6, TO_DATE('2023-06-06', 'YYYY-MM-DD'), '/imagens/pacientes/paciente6/imagem6', 'Paciente com retinoblastoma.');
INSERT INTO tb_sv_imagens (id_paciente, data_arquivo, caminho_arquivos, observacoes) VALUES (7, TO_DATE('2023-07-07', 'YYYY-MM-DD'), '/imagens/pacientes/paciente7/imagem7', 'Paciente com suspeita de retinoblastoma.');
INSERT INTO tb_sv_imagens (id_paciente, data_arquivo, caminho_arquivos, observacoes) VALUES (8, TO_DATE('2023-08-08', 'YYYY-MM-DD'), '/imagens/pacientes/paciente8/imagem8', 'Paciente sem retinoblastoma.');
INSERT INTO tb_sv_imagens (id_paciente, data_arquivo, caminho_arquivos, observacoes) VALUES (9, TO_DATE('2023-09-09', 'YYYY-MM-DD'), '/imagens/pacientes/paciente9/imagem9', 'Paciente sem retinoblastoma.');
INSERT INTO tb_sv_imagens (id_paciente, data_arquivo, caminho_arquivos, observacoes) VALUES (10, TO_DATE('2023-09-09', 'YYYY-MM-DD'), '/imagens/pacientes/paciente10/imagem10', 'Paciente com retinoblastoma.');

-- INSERTS tb_sv_resultados
INSERT INTO tb_sv_resultados (id_imagem, data_analise, diagnostico, probabilidade, comentarios) VALUES (1, TO_DATE('2022-01-15', 'YYYY-MM-DD'), 'Retinoblastoma', 95.5, 'De acordo com a an�lise das imagens, o paciente tem alta probabilidade de ter retinoblastoma. Um acompanhamento com especialistas da �rea � recomendado.');
INSERT INTO tb_sv_resultados (id_imagem, data_analise, diagnostico, probabilidade, comentarios) VALUES (2, TO_DATE('2022-02-20', 'YYYY-MM-DD'), 'Retinoblastoma', 88.2, 'De acordo com a an�lise das imagens, o paciente tem alta probabilidade de ter retinoblastoma. Um acompanhamento com especialistas da �rea � recomendado.');
INSERT INTO tb_sv_resultados (id_imagem, data_analise, diagnostico, probabilidade, comentarios) VALUES (3, TO_DATE('2022-03-25', 'YYYY-MM-DD'), 'Poss�vel Retinoblastoma', 75.0, 'De acordo com a an�lise das imagens, o paciente pode ser acometido com retinoblastoma. � recomendado n�o somente um acompanhamento com especialistas, mas tamb�m exames para acertividade no diagn�stico.');
INSERT INTO tb_sv_resultados (id_imagem, data_analise, diagnostico, probabilidade, comentarios) VALUES (4, TO_DATE('2022-04-10', 'YYYY-MM-DD'), 'Improv�vel Retinoblastoma', 30.8, 'De acordo com a an�lise das imagens, o paciente tem baixa probabilidade de ter retinoblastoma. Ainda assim, � recomendado a consulta com um especialista e um teste feito pelo profissional para retirar as d�vidas.');
INSERT INTO tb_sv_resultados (id_imagem, data_analise, diagnostico, probabilidade, comentarios) VALUES (5, TO_DATE('2022-05-12', 'YYYY-MM-DD'), 'Poss�vel Retinoblastoma', 82.3, 'De acordo com a an�lise das imagens, o paciente pode ser acometido com retinoblastoma. � recomendado n�o somente um acompanhamento com especialistas, mas tamb�m exames para acertividade no diagn�stico.');
INSERT INTO tb_sv_resultados (id_imagem, data_analise, diagnostico, probabilidade, comentarios) VALUES (6, TO_DATE('2022-06-18', 'YYYY-MM-DD'), 'Retinoblastoma', 93.7, 'De acordo com a an�lise das imagens, o paciente tem alta probabilidade de ter retinoblastoma. Um acompanhamento com especialistas da �rea � recomendado.');
INSERT INTO tb_sv_resultados (id_imagem, data_analise, diagnostico, probabilidade, comentarios) VALUES (7, TO_DATE('2022-07-21', 'YYYY-MM-DD'), 'Poss�vel Retinoblastoma', 55.9, 'De acordo com a an�lise das imagens, o paciente pode ser acometido com retinoblastoma. � recomendado n�o somente um acompanhamento com especialistas, mas tamb�m exames para acertividade no diagn�stico.');
INSERT INTO tb_sv_resultados (id_imagem, data_analise, diagnostico, probabilidade, comentarios) VALUES (8, TO_DATE('2022-08-30', 'YYYY-MM-DD'), 'N�o acometido por Retinoblastoma', 14.2, 'De acordo com a an�lise das imagens, o paciente n�o � acometido por retinoblastoma. A princ�pio, n�o � necess�rio acompanhamento m�dico, apenas a recomenda��o de aten��o para o mesmo.');
INSERT INTO tb_sv_resultados (id_imagem, data_analise, diagnostico, probabilidade, comentarios) VALUES (9, TO_DATE('2022-09-05', 'YYYY-MM-DD'), 'N�o acometido por Retinoblastoma', 10.1, 'De acordo com a an�lise das imagens, o paciente n�o � acometido por retinoblastoma. A princ�pio, n�o � necess�rio acompanhamento m�dico, apenas a recomenda��o de aten��o para o mesmo.');
INSERT INTO tb_sv_resultados (id_imagem, data_analise, diagnostico, probabilidade, comentarios) VALUES (10, TO_DATE('2022-10-10', 'YYYY-MM-DD'), 'Retinoblastoma', 88.9, 'De acordo com a an�lise das imagens, o paciente tem alta probabilidade de ter retinoblastoma. Um acompanhamento com especialistas da �rea � recomendado.');

-- INSERTS tb_sv_medicos
INSERT INTO tb_sv_medicos (nome_medico, telefone_medico, crm_medico) VALUES ('Ricardo Silva', 9998887776, 'CRM 12345');
INSERT INTO tb_sv_medicos (nome_medico, telefone_medico, crm_medico) VALUES ('Fernanda Oliveira', 3332221110, 'CRM 67890');
INSERT INTO tb_sv_medicos (nome_medico, telefone_medico, crm_medico) VALUES ('Alexandre Martins', 1112223334, 'CRM 45678');
INSERT INTO tb_sv_medicos (nome_medico, telefone_medico, crm_medico) VALUES ('Juliana Costa', 5556667778, 'CRM 98765');
INSERT INTO tb_sv_medicos (nome_medico, telefone_medico, crm_medico) VALUES ('Eduardo Pereira', 4445556667, 'CRM 23456');
INSERT INTO tb_sv_medicos (nome_medico, telefone_medico, crm_medico) VALUES ('Camila Santos', 7778889990, 'CRM 87654');
INSERT INTO tb_sv_medicos (nome_medico, telefone_medico, crm_medico) VALUES ('Marcelo Almeida', 1234567890, 'CRM 34567');
INSERT INTO tb_sv_medicos (nome_medico, telefone_medico, crm_medico) VALUES ('Beatriz Lima', 9876543210, 'CRM 76543');
INSERT INTO tb_sv_medicos (nome_medico, telefone_medico, crm_medico) VALUES ('Gustavo Ferreira', 4567890123, 'CRM 56789');
INSERT INTO tb_sv_medicos (nome_medico, telefone_medico, crm_medico) VALUES ('Isabela Rocha', 6543210987, 'CRM 87654');

-- INSERTS tb_sv_hospitais
INSERT INTO tb_sv_hospitais (nome_hospital, telefone_hospital, endereco_hospital) VALUES ('Hospital S�o Luiz', 1112223334, 'Rua Francisco Marengo, 1312 - Jardim Analia Franco, S�o Paulo - SP, 03313-001');
INSERT INTO tb_sv_hospitais (nome_hospital, telefone_hospital, endereco_hospital) VALUES ('Hospital Alem�o Oswaldo Cruz', 5556667778, 'Rua Treze de Maio, 1815 - Bela Vista, S�o Paulo - SP, 01323-020');
INSERT INTO tb_sv_hospitais (nome_hospital, telefone_hospital, endereco_hospital) VALUES ('Hospital Samaritano Paulista', 9998887776, 'Rua Doutor Fausto Ferraz, 204-232 - Bela Vista, S�o Paulo - SP, 01333-030');
INSERT INTO tb_sv_hospitais (nome_hospital, telefone_hospital, endereco_hospital) VALUES ('Hospital das Cl�nicas da Faculdade de Medicina da USP', 3332221110, 'Rua Doutor Ov�dio Pires de Campos, 225 - Cerqueira C�sar, S�o Paulo - SP, 05403-010');
INSERT INTO tb_sv_hospitais (nome_hospital, telefone_hospital, endereco_hospital) VALUES ('Hospital Albert Einstein', 4445556667, 'Avenida Paulista, 2064 - Bela Vista, S�o Paulo - SP, 01310-200');
INSERT INTO tb_sv_hospitais (nome_hospital, telefone_hospital, endereco_hospital) VALUES ('Hospital Benefic�ncia Portuguesa', 7778889990, 'Rua Maestro Cardim, 637 - Bela Vista, S�o Paulo - SP, 01323-001');
INSERT INTO tb_sv_hospitais (nome_hospital, telefone_hospital, endereco_hospital) VALUES ('Hospital 9 de Julho', 1234567890, 'Rua Peixoto Gomide, 645 - Cerqueira C�sar, S�o Paulo - SP, 01409-002');
INSERT INTO tb_sv_hospitais (nome_hospital, telefone_hospital, endereco_hospital) VALUES ('Hospital da Luz', 9876543210, 'Rus Azevedo Macedo, 113 - Vila Mariana, S�o Paulo - SP, 04013-060');
INSERT INTO tb_sv_hospitais (nome_hospital, telefone_hospital, endereco_hospital) VALUES ('Hospital Nipo-Brasileiro', 4567890123, 'Rua Pist�ia, 100 - Parque Novo Mundo, S�o Paulo - SP, 02189-000');
INSERT INTO tb_sv_hospitais (nome_hospital, telefone_hospital, endereco_hospital) VALUES ('Hospital S�rio-Liban�s', 6543210987, 'Rua Dona Adma Jafet, 91 - Bela Vista, S�o Paulo - SP, 01308-050');

-- INSERTS tb_sv_medico_hospital
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (1, 1);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (1, 2);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (2, 1);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (2, 2);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (3, 3);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (3, 4);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (4, 4);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (4, 5);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (5, 5);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (6, 6);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (7, 7);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (8, 8);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (8, 9);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (9, 9);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (10, 8);
INSERT INTO tb_sv_medico_hospital (id_medico, id_hospital) VALUES (10, 10);

-- INSERTS tb_informacoes
INSERT INTO tb_sv_informacoes (id_resultado, id_medico_hospital, observacoes) VALUES (1, 1, 'Paciente acometido por retinoblastoma. Indicado procurar m�dicos ou hospitais que aceitem seu conv�nio, caso o tenha, para acompanhamento com profissionais e poss�vel tratamento.');
INSERT INTO tb_sv_informacoes (id_resultado, id_medico_hospital, observacoes) VALUES (2, 2, 'Paciente acometido por retinoblastoma. Indicado procurar m�dicos ou hospitais que aceitem seu conv�nio, caso o tenha, para acompanhamento com profissionais e poss�vel tratamento.');
INSERT INTO tb_sv_informacoes (id_resultado, id_medico_hospital, observacoes) VALUES (3, 4, 'Paciente com suspeita de retinoblastoma. Indicado procurar m�dicos ou hospitais que aceitem seu conv�nio, caso o tenha, para acompanhamento com profissionais e poss�vel tratamento, caso confirma��o seja feita ap�s testes e exames.');
INSERT INTO tb_sv_informacoes (id_resultado, id_medico_hospital, observacoes) VALUES (4, 5, 'Paciente com baixa probabilidade de retinoblastoma. Indicado retirar a d�vida ap�s exames e testes em hospitais ou m�dicos recomendados de acordo com seu conv�nio, caso o tenha.');
INSERT INTO tb_sv_informacoes (id_resultado, id_medico_hospital, observacoes) VALUES (5, 6, 'Paciente com suspeita de retinoblastoma. Indicado procurar m�dicos ou hospitais que aceitem seu conv�nio, caso o tenha, para acompanhamento com profissionais e poss�vel tratamento, caso confirma��o seja feita ap�s testes e exames.');
INSERT INTO tb_sv_informacoes (id_resultado, id_medico_hospital, observacoes) VALUES (6, 7, 'Paciente acometido por retinoblastoma. Indicado procurar m�dicos ou hospitais que aceitem seu conv�nio, caso o tenha, para acompanhamento com profissionais e poss�vel tratamento.');
INSERT INTO tb_sv_informacoes (id_resultado, id_medico_hospital, observacoes) VALUES (7, 8, 'Paciente com suspeita de retinoblastoma. Indicado procurar m�dicos ou hospitais que aceitem seu conv�nio, caso o tenha, para acompanhamento com profissionais e poss�vel tratamento, caso confirma��o seja feita ap�s testes e exames.');
INSERT INTO tb_sv_informacoes (id_resultado, id_medico_hospital, observacoes) VALUES (8, 10, 'Paciente n�o acometido por retinoblastoma. Caso volte a ter d�vidas, indicado a reutiliza��o do aplicativo para novo teste.');
INSERT INTO tb_sv_informacoes (id_resultado, id_medico_hospital, observacoes) VALUES (9, 12, 'Paciente n�o acometido por retinoblastoma. Caso volte a ter d�vidas, indicado a reutiliza��o do aplicativo para novo teste.');
INSERT INTO tb_sv_informacoes (id_resultado, id_medico_hospital, observacoes) VALUES (10, 13, 'Paciente acometido por retinoblastoma. Indicado procurar m�dicos ou hospitais que aceitem seu conv�nio, caso o tenha, para acompanhamento com profissionais e poss�vel tratamento.');
