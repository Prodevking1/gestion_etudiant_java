<<<<<<< HEAD
create database gestion;

create table etudiants(
create table etudiants{
    matricule varchar(255) not null primary key,
    nom varchar(255) not null,
    prenom varchar(255) not null,
    dte_naiss varchar(255) not null,
    lieu_naiss varchar(255) not null,
    genre varchar(255) not null,
    email varchar(255) not null
);

create table notes(
};

create table notes{
    valeur int not null,
    dateEval date not null,
    appreciation varchar(255) not null,
    session_Note varchar(255) not null
);
create table semestre(
};
create table semestre{
    niveau varchar(255) not null,
    numero varchar(255) not null primary key,
    fil varchar(255) not null,
    debut date not null,
    fin date not null
);

create table ecu(
};

create table ecu{
    code varchar(255) not null primary key,
    nom varchar(255) not null,
    vh int not null,
    credit int not null
);
}
=======
create database gestion;

create table etudiants(
create table etudiants{
    matricule varchar(255) not null primary key,
    nom varchar(255) not null,
    prenom varchar(255) not null,
    dte_naiss varchar(255) not null,
    lieu_naiss varchar(255) not null,
    genre varchar(255) not null,
    email varchar(255) not null
);

create table notes(
};

create table notes(
    code varchar(255) primary key,
    matiere varchar(255) not null,
    valeur int(255) not null,
    dateEval varchar(255) not null,
    appreciation varchar(255) not null,
    session_Note varchar(255) not null
);
create table semestre(
};
create table semestre{
    niveau varchar(255) not null,
    numero varchar(255) not null primary key,
    fil varchar(255) not null,
    debut date not null,
    fin date not null
);

create table ecu(
};

create table ecu{
    code varchar(255) not null primary key,
    nom varchar(255) not null,
    vh int not null,
    credit int not null
);
}
>>>>>>> 9d45889c87ec3ab632f309d7c33e134e8858b1a3
