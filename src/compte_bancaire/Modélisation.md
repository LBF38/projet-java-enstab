# Compte bancaire

## Introduction

Cet exercice de TP se concentre sur la modélisation d'un compte bancaire. Nous devons, à partir d'un cahier des charges, modéliser l'implémentation des fonctionnalités en une classe Java.

Ce document est là pour que je modélise le problème des comptes bancaires.

## Lecture du cahier des charges

compte bancaire = numéro unique de compte. => entier positif unique. (génération d'un UUID)

compte associé à une personne morale. => prénom, nom, infos de la personne. => titulaire du compte.
Contrainte: une fois créée, on ne peut pas modifier les infos.

Somme d'argent = solde du compte.
en Euros.
Contrainte: nb décimal positif, nul ou négatif.

Compte à découvert (temporaire)
=> solde négatif.
découvert nul = solde positif ou nul.
sinon, découvert = val. abs(solde négatif).
Contrainte: limite de découvert fixé à la création du compte ou révisé. => découvert max.

Découvert max
=> définit arbitrairement lors création compte.
=> révisable selon modifs revenus du titulaire du compte.

Créditer un compte
= ajouter montant positif au solde.

Débiter un compte
= retirer un montant positif du solde.
Contrainte:
=> solde résultant >= découvert max.
=> limite de débit. = débit max.
Débit max définit arbitrairement comme découvert max.

Effectuer un virement
= débiter un compte pour créditer un autre.

Création de compte
=> nom titulaire requis.
par défaut:

- débit initial = 0
- découvert max = 800€
- débit max = 1000€

Possibilité de modifier valeurs par défaut lors création compte.

Toutes les infos du compte sont consultables:

- n° compte
- nom titulaire
- montant découvert max
- montant débit max
- situation compte (à découvert ?)
- montant débit autorisé (fonction solde courant, débit max, découvert max)

## Modélisation

### Attributs

- titulaire: String
- id:int
- solde:double
- decouvert_max:double
- debit_max:double

### Méthodes

- effectuerVirement(montant, destinataire)
- crediter(montant)
- debiter(montant)
- montrerSolde()
