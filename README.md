# BankManager 🏦

Un projet Java illustrant le concept d'**héritage** à travers un système de comptes bancaires. Une classe mère `BankAccount` est étendue par trois types de comptes différents.


## Comment ça marche ?

Le projet utilise l'héritage Java : `BankAccount` est la classe parent qui détient les attributs communs (`account`, `balance`). Trois classes enfants l'étendent, chacune ajoutant son propre attribut spécifique.

## Structure du projet

```
├── BankAccount.java # Classe mère
├── CheckingAccount.java # Compte courant (hérite de BankAccount)
├── SavingsAccount.java # Compte épargne (hérite de BankAccount)
├── COD.java # Certificat de dépôt (hérite de BankAccount)
└── Main.java # Point d'entrée du programme
```

## Technologies utilisées

`Java` `POO` `Héritage`

## Commencer

```bash
# Compilateur tous les fichiers
javac *.java

# Lancer le programme
Java Principal
```

## Personnalisation

`Compte bancaire`

Ajouter des attributs communs à tous les comptes (ex: `owner`, `currency`) directement dans la classe mère pour qu'elles soient automatiquement héritées par toutes les classes filles.

`CheckingAccount` · `SavingsAccount` · `COD`

Ajoutez des méthodes spécifiques à chaque type de compte, comme `withdraw()`, `deposit()`, ou `calculateInterest()` pour enrichir le projet.
