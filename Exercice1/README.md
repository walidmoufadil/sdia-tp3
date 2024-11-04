# Classe TropViteException

## Français

La classe `TropViteException` est une exception personnalisée déclenchée lorsque la vitesse dépasse une certaine limite. Elle hérite de la classe `Exception` et permet de gérer des cas spécifiques où une vitesse trop élevée est détectée.

### Attributs
Aucun attribut spécifique n'est défini dans cette classe, mais elle utilise un message personnalisé pour indiquer la vitesse qui a causé l'exception.

### Constructeurs
- `TropViteException(int vitesse)`: Crée une instance de `TropViteException` avec un message indiquant la vitesse en cause.
    - **Paramètre**:
        - `vitesse` (int) : La vitesse ayant déclenché l'exception.

### Méthodes
Cette classe hérite des méthodes de la classe `Exception`. Le message de l'exception est personnalisé pour inclure la vitesse.

### Exemple d'utilisation
Cette exception peut être utilisée pour contrôler la vitesse d'un élément et déclencher une alerte si la limite est dépassée.

---

# TropViteException Class

## English

The `TropViteException` class is a custom exception triggered when the speed exceeds a certain limit. It extends the `Exception` class and is used to handle specific cases where an excessive speed is detected.

### Attributes
No specific attributes are defined in this class, but it includes a custom message to indicate the speed that caused the exception.

### Constructors
- `TropViteException(int vitesse)`: Creates an instance of `TropViteException` with a message indicating the speed involved.
    - **Parameter**:
        - `vitesse` (int): The speed that triggered the exception.

### Methods
This class inherits methods from the `Exception` class. The exception message is customized to include the speed.

### Usage Example
This exception can be used to monitor the speed of an element and trigger an alert if the limit is exceeded.

---

# Classe Vehicule

## Français

La classe `Vehicule` représente un véhicule qui contrôle sa vitesse à l'aide d'une méthode `testVitesse`. Si la vitesse dépasse une limite spécifiée (90 dans cet exemple), elle déclenche une exception de type `TropViteException`.

### Méthodes
- `Vehicule()`: Constructeur par défaut de la classe `Vehicule`.
- `void testVitesse(int vitesse) throws TropViteException`: Teste si la vitesse donnée dépasse la limite. Si oui, déclenche une `TropViteException` avec la vitesse en cause.
    - **Paramètre**:
        - `vitesse` (int) : La vitesse à tester.
    - **Exception**:
        - `TropViteException` : Déclenchée si la vitesse dépasse la limite de 90.

### Exemple d'utilisation
Le programme principal crée un objet `Vehicule` et teste plusieurs vitesses. Si la vitesse dépasse la limite, le message de l'exception est affiché dans la console.

---

# Vehicule Class

## English

The `Vehicule` class represents a vehicle that controls its speed using the `testVitesse` method. If the speed exceeds a specified limit (90 in this example), it triggers a `TropViteException`.

### Methods
- `Vehicule()`: Default constructor for the `Vehicule` class.
- `void testVitesse(int vitesse) throws TropViteException`: Tests if the given speed exceeds the limit. If so, it throws a `TropViteException` with the speed involved.
    - **Parameter**:
        - `vitesse` (int): The speed to test.
    - **Exception**:
        - `TropViteException`: Thrown if the speed exceeds the limit of 90.

### Usage Example
The main program creates a `Vehicule` object and tests several speeds. If the speed exceeds the limit, the exception message is displayed in the console.
