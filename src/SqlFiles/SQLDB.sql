/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Abdelkrim
 * Created: Jan 6, 2019
 */

-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  Dim 06 jan. 2019 à 08:47
-- Version du serveur :  5.7.23
-- Version de PHP :  7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestclick`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

DROP TABLE IF EXISTS `administrateur`;
CREATE TABLE IF NOT EXISTS `administrateur` (
  `ID_EMPLOYE` varchar(20) NOT NULL,
  `LOGIN` varchar(20) NOT NULL,
  `CIN` varchar(20) DEFAULT NULL,
  `NOM` varchar(20) DEFAULT NULL,
  `PRENOM` varchar(20) DEFAULT NULL,
  `sexe` varchar(7) NOT NULL,
  `DATE_NAISSANCE` date DEFAULT NULL,
  `Tele` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `DATE__D_EMBAUCHE` date DEFAULT NULL,
  PRIMARY KEY (`ID_EMPLOYE`),
  KEY `FK_ATHENTIFICATIONA` (`LOGIN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `allergie`
--

DROP TABLE IF EXISTS `allergie`;
CREATE TABLE IF NOT EXISTS `allergie` (
  `ID_ALLERGIE` varchar(20) NOT NULL,
  `TYPE` varchar(20) DEFAULT NULL,
  `DEGRE` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID_ALLERGIE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `antecedant`
--

DROP TABLE IF EXISTS `antecedant`;
CREATE TABLE IF NOT EXISTS `antecedant` (
  `ID_ANTECEDANT` varchar(20) NOT NULL,
  `ID_PATIENT` varchar(20) NOT NULL,
  `DESIGNATION` varchar(20) DEFAULT NULL,
  `DESCRIPTION` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_ANTECEDANT`),
  KEY `FK_AVOIR_ANTECEDANT` (`ID_PATIENT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `avoir_allergie`
--

DROP TABLE IF EXISTS `avoir_allergie`;
CREATE TABLE IF NOT EXISTS `avoir_allergie` (
  `ID_PATIENT` varchar(20) NOT NULL,
  `ID_ALLERGIE` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_PATIENT`,`ID_ALLERGIE`),
  KEY `FK_AVOIR_ALLERGIE2` (`ID_ALLERGIE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

DROP TABLE IF EXISTS `compte`;
CREATE TABLE IF NOT EXISTS `compte` (
  `LOGIN` varchar(20) NOT NULL,
  `ID_ADMINISTRATEUR` varchar(20) NOT NULL,
  `MDP` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`LOGIN`),
  KEY `FK_CREER_COMPTE` (`ID_ADMINISTRATEUR`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `dentiste`
--

DROP TABLE IF EXISTS `dentiste`;
CREATE TABLE IF NOT EXISTS `dentiste` (
  `ID_EMPLOYE` varchar(20) NOT NULL,
  `LOGIN` varchar(20) NOT NULL,
  `CIN` varchar(20) DEFAULT NULL,
  `NOM` varchar(20) DEFAULT NULL,
  `PRENOM` varchar(20) DEFAULT NULL,
  `sexe` varchar(7) NOT NULL,
  `DATE_NAISSANCE` date DEFAULT NULL,
  `Tele` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `DATE__D_EMBAUCHE` date DEFAULT NULL,
  PRIMARY KEY (`ID_EMPLOYE`),
  KEY `FK_AUTHENTIFICATIOND` (`LOGIN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `employe`
--

DROP TABLE IF EXISTS `employe`;
CREATE TABLE IF NOT EXISTS `employe` (
  `ID_EMPLOYE` varchar(20) NOT NULL,
  `CIN` varchar(20) DEFAULT NULL,
  `NOM` varchar(20) DEFAULT NULL,
  `PRENOM` varchar(20) DEFAULT NULL,
  `sexe` varchar(7) NOT NULL,
  `DATE_NAISSANCE` date DEFAULT NULL,
  `Tele` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `DATE_EMBAUCHE` date DEFAULT NULL,
  PRIMARY KEY (`ID_EMPLOYE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `operation`
--

DROP TABLE IF EXISTS `operation`;
CREATE TABLE IF NOT EXISTS `operation` (
  `ID_DENTISTE` varchar(20) NOT NULL,
  `ID_PATIENT` varchar(20) NOT NULL,
  `TYPE_OPERATION` varchar(20) DEFAULT NULL,
  `DATE` date DEFAULT NULL,
  `REMARQUE` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_DENTISTE`,`ID_PATIENT`),
  KEY `FK_OPERER2` (`ID_PATIENT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `ID_PATIENT` varchar(20) NOT NULL,
  `ID_RECEPTIONNISTE` varchar(20) NOT NULL,
  `NOM` varchar(20) DEFAULT NULL,
  `PRENOM` varchar(20) DEFAULT NULL,
  `sexe` varchar(7) NOT NULL,
  `DATE_NAISSANCE` date DEFAULT NULL,
  `Tele` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `LIEU_NAISSANCE` varchar(20) DEFAULT NULL,
  `CIN` varchar(20) DEFAULT NULL,
  `TYPE_DE_SANG` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID_PATIENT`),
  KEY `FK_CREER_DOSSIER` (`ID_RECEPTIONNISTE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `receptioniste`
--

DROP TABLE IF EXISTS `receptioniste`;
CREATE TABLE IF NOT EXISTS `receptioniste` (
  `ID_EMPLOYE` varchar(20) NOT NULL,
  `LOGIN` varchar(20) NOT NULL,
  `CIN` varchar(20) DEFAULT NULL,
  `NOM` varchar(20) DEFAULT NULL,
  `PRENOM` varchar(20) DEFAULT NULL,
  `sexe` varchar(7) NOT NULL,
  `DATE_NAISSANCE` date DEFAULT NULL,
  `Tele` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `DATE__D_EMBAUCHE` date DEFAULT NULL,
  PRIMARY KEY (`ID_EMPLOYE`),
  KEY `FK_AUTHENTIFICATIONR` (`LOGIN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `rendez_vous`
--

DROP TABLE IF EXISTS `rendez_vous`;
CREATE TABLE IF NOT EXISTS `rendez_vous` (
  `ID_RECEPTIONNISTE` varchar(20) NOT NULL,
  `ID_PATIENT` varchar(20) NOT NULL,
  `DATE` date DEFAULT NULL,
  `HEURE` time DEFAULT NULL,
  `VALIDATION` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID_RECEPTIONNISTE`,`ID_PATIENT`),
  KEY `FK_RENDEZ_VOUS2` (`ID_PATIENT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `administrateur`
--
ALTER TABLE `administrateur`
  ADD CONSTRAINT `FK_ATHENTIFICATIONA` FOREIGN KEY (`LOGIN`) REFERENCES `compte` (`LOGIN`),
  ADD CONSTRAINT `FK_HERITAGE_3` FOREIGN KEY (`ID_EMPLOYE`) REFERENCES `employe` (`ID_EMPLOYE`);

--
-- Contraintes pour la table `antecedant`
--
ALTER TABLE `antecedant`
  ADD CONSTRAINT `FK_AVOIR_ANTECEDANT` FOREIGN KEY (`ID_PATIENT`) REFERENCES `patient` (`ID_PATIENT`);

--
-- Contraintes pour la table `avoir_allergie`
--
ALTER TABLE `avoir_allergie`
  ADD CONSTRAINT `FK_AVOIR_ALLERGIE` FOREIGN KEY (`ID_PATIENT`) REFERENCES `patient` (`ID_PATIENT`),
  ADD CONSTRAINT `FK_AVOIR_ALLERGIE2` FOREIGN KEY (`ID_ALLERGIE`) REFERENCES `allergie` (`ID_ALLERGIE`);

--
-- Contraintes pour la table `compte`
--
ALTER TABLE `compte`
  ADD CONSTRAINT `FK_ATHENTIFICATIONA2` FOREIGN KEY (`ID_ADMINISTRATEUR`) REFERENCES `administrateur` (`ID_EMPLOYE`),
  ADD CONSTRAINT `FK_CREER_COMPTE` FOREIGN KEY (`ID_ADMINISTRATEUR`) REFERENCES `administrateur` (`ID_EMPLOYE`);

--
-- Contraintes pour la table `dentiste`
--
ALTER TABLE `dentiste`
  ADD CONSTRAINT `FK_AUTHENTIFICATIOND` FOREIGN KEY (`LOGIN`) REFERENCES `compte` (`LOGIN`),
  ADD CONSTRAINT `FK_HERITAGE_2` FOREIGN KEY (`ID_EMPLOYE`) REFERENCES `employe` (`ID_EMPLOYE`);

--
-- Contraintes pour la table `operation`
--
ALTER TABLE `operation`
  ADD CONSTRAINT `FK_OPERER` FOREIGN KEY (`ID_DENTISTE`) REFERENCES `dentiste` (`ID_EMPLOYE`),
  ADD CONSTRAINT `FK_OPERER2` FOREIGN KEY (`ID_PATIENT`) REFERENCES `patient` (`ID_PATIENT`);

--
-- Contraintes pour la table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `FK_CREER_DOSSIER` FOREIGN KEY (`ID_RECEPTIONNISTE`) REFERENCES `receptioniste` (`ID_EMPLOYE`);

--
-- Contraintes pour la table `receptioniste`
--
ALTER TABLE `receptioniste`
  ADD CONSTRAINT `FK_AUTHENTIFICATIONR` FOREIGN KEY (`LOGIN`) REFERENCES `compte` (`LOGIN`),
  ADD CONSTRAINT `FK_HERITAGE_1` FOREIGN KEY (`ID_EMPLOYE`) REFERENCES `employe` (`ID_EMPLOYE`);

--
-- Contraintes pour la table `rendez_vous`
--
ALTER TABLE `rendez_vous`
  ADD CONSTRAINT `FK_RENDEZ_VOUS` FOREIGN KEY (`ID_RECEPTIONNISTE`) REFERENCES `receptioniste` (`ID_EMPLOYE`),
  ADD CONSTRAINT `FK_RENDEZ_VOUS2` FOREIGN KEY (`ID_PATIENT`) REFERENCES `patient` (`ID_PATIENT`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
