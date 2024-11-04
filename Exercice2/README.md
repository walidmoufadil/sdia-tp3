# Classe RacineCarreException

## Français

La classe `RacineCarreException` est une exception personnalisée déclenchée lorsqu'un nombre négatif est passé pour une opération de racine carrée. Elle hérite de la classe `Exception` et est utilisée pour gérer les cas spécifiques où une racine carrée de nombre négatif est tentée.

### Attributs
Aucun attribut spécifique n'est défini dans cette classe, mais elle utilise un message personnalisé pour indiquer la valeur négative qui a causé l'exception.

### Constructeurs
- `RacineCarreException(int valeur)`: Crée une instance de `RacineCarreException` avec un message indiquant la valeur en cause.
    - **Paramètre**:
        - `valeur` (int) : La valeur négative ayant déclenché l'exception.

### Méthodes
Cette classe hérite des méthodes de la classe `Exception`. Le message de l'exception est personnalisé pour inclure la valeur négative.

### Exemple d'utilisation
Cette exception peut être utilisée dans un contexte où les racines carrées ne sont autorisées que pour des nombres positifs. En cas de nombre négatif, elle déclenche une alerte avec le message d'exception approprié.

---

# RacineCarreException Class

## English

The `RacineCarreException` class is a custom exception triggered when a negative number is provided for a square root operation. It extends the `Exception` class and is used to handle specific cases where a square root of a negative number is attempted.

### Attributes
No specific attributes are defined in this class, but it includes a custom message to indicate the negative value that caused the exception.

### Constructors
- `RacineCarreException(int valeur)`: Creates an instance of `RacineCarreException` with a message indicating the value involved.
    - **Parameter**:
        - `valeur` (int): The negative value that triggered the exception.

### Methods
This class inherits methods from the `Exception` class. The exception message is customized to include the negative value.

### Usage Example
This exception can be used in contexts where square roots are only allowed for positive numbers. If a negative number is encountered, it triggers an alert with the appropriate exception message.

---

# Classe Calculateur

## Français

La classe `Calculateur` permet d'effectuer des opérations mathématiques, notamment le test de la validité d'un nombre pour calculer sa racine carrée. Elle utilise la classe `RacineCarreException` pour gérer les cas où une tentative de calcul de racine carrée d'un nombre négatif est effectuée.

### Méthodes
- `Calculateur()`: Constructeur par défaut de la classe `Calculateur`.
- `void testRacineCarre(int valeur) throws RacineCarreException`: Teste si la valeur donnée est négative. Si c'est le cas, elle déclenche une `RacineCarreException`.
    - **Paramètre**:
        - `valeur` (int) : La valeur à tester pour la racine carrée.
    - **Exception**:
        - `RacineCarreException` : Déclenchée si la valeur est négative.

### Exemple d'utilisation
Le programme principal crée un objet `Calculateur` et teste plusieurs valeurs. Si une valeur négative est fournie, le message de l'exception est affiché dans la console.

---

# Calculateur Class

## English

The `Calculateur` class performs mathematical operations, specifically testing the validity of a number for calculating its square root. It uses the `RacineCarreException` class to handle cases where an attempt is made to calculate the square root of a negative number.

### Methods
- `Calculateur()`: Default constructor for the `Calculateur` class.
- `void testRacineCarre(int valeur) throws RacineCarreException`: Tests if the given value is negative. If so, it throws a `RacineCarreException`.
    - **Parameter**:
        - `valeur` (int): The value to test for square root validity.
    - **Exception**:
        - `RacineCarreException`: Thrown if the value is negative.

### Usage Example
The main program creates a `Calculateur` object and tests several values. If a negative value is provided, the exception message is displayed in the console.

