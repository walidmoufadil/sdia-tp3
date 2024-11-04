# Classe NoteInvalideException

## Français

La classe `NoteInvalideException` est une exception personnalisée qui est déclenchée lorsqu'une note invalide est fournie. Elle hérite de la classe `Exception` et est utilisée pour gérer les cas où une note en dehors de la plage autorisée (typiquement entre 0 et 20) est saisie.

### Attributs
Aucun attribut spécifique n'est défini dans cette classe, mais elle utilise un message personnalisé pour indiquer la valeur de la note invalide qui a causé l'exception.

### Constructeurs
- `NoteInvalideException(int valeur)`: Crée une instance de `NoteInvalideException` avec un message indiquant la note en cause.
    - **Paramètre**:
        - `valeur` (int) : La note invalide ayant déclenché l'exception.

### Méthodes
Cette classe hérite des méthodes de la classe `Exception`. Le message de l'exception est personnalisé pour inclure la note invalide.

### Exemple d'utilisation
Cette exception peut être utilisée dans des contextes où des notes doivent être validées avant d'être acceptées, par exemple, lors de l'entrée des notes des étudiants. En cas de note invalide, l'exception est déclenchée avec un message approprié.

---

# NoteInvalideException Class

## English

The `NoteInvalideException` class is a custom exception triggered when an invalid grade is provided. It extends the `Exception` class and is used to handle cases where a grade outside the allowed range (typically between 0 and 20) is entered.

### Attributes
No specific attributes are defined in this class, but it includes a custom message to indicate the invalid grade that caused the exception.

### Constructors
- `NoteInvalideException(int valeur)`: Creates an instance of `NoteInvalideException` with a message indicating the grade involved.
    - **Parameter**:
        - `valeur` (int): The invalid grade that triggered the exception.

### Methods
This class inherits methods from the `Exception` class. The exception message is customized to include the invalid grade.

### Usage Example
This exception can be used in contexts where grades must be validated before being accepted, such as when entering student grades. If an invalid grade is provided, the exception is triggered with an appropriate message.

---

