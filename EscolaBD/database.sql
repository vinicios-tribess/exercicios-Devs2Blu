SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS Aluno;
DROP TABLE IF EXISTS Matricula;
DROP TABLE IF EXISTS Disciplina;
DROP TABLE IF EXISTS Avaliacao;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE Aluno (
    codaluno integer auto_increment NOT NULL,
    nomaluno varchar(40) NOT NULL,
    nommae varchar(40),
    nompai varchar(40),
    datanasc Date NOT NULL,
    medaluno decimal(4,2),
    sitaluno char(01),
    PRIMARY KEY (codaluno)
);

CREATE TABLE Matricula (
    codaluno integer NOT NULL,
    coddisciplina integer NOT NULL,
    dtmatricula Date NOT NULL,
    statusmatricula char(01) NOT NULL,
    PRIMARY KEY (codaluno, coddisciplina)
);

CREATE TABLE Disciplina (
    coddisciplina integer auto_increment NOT NULL,
    nomdisciplina varchar(30) NOT NULL,
    nomprofessor varchar(40) NOT NULL,
    qtdavaliacoes integer NOT NULL,
    PRIMARY KEY (coddisciplina)
);

CREATE TABLE Avaliacao (
    codaluno integer NOT NULL,
    coddisciplina integer NOT NULL,
    nravaliacao integer NOT NULL,
    vlrnota decimal(4,2) NOT NULL,
    PRIMARY KEY (codaluno, coddisciplina, nravaliacao)
);

ALTER TABLE Matricula ADD FOREIGN KEY (codaluno) REFERENCES Aluno(codaluno);
ALTER TABLE Matricula ADD FOREIGN KEY (coddisciplina) REFERENCES Disciplina(coddisciplina);
ALTER TABLE Avaliacao ADD FOREIGN KEY (codaluno) REFERENCES Matricula(codaluno);
ALTER TABLE Avaliacao ADD FOREIGN KEY (coddisciplina) REFERENCES Matricula(coddisciplina);