# Exercice 01 : Le chien - solution
## PARTIE 5 : Qu'est-ce qui a changé avec la partie 4 ?
Regardez avec attention les deux situations ci-dessous représentées l'aide d'un diagramme de classes UML et répondez aux questions :

```mermaid
---
title: Situation avant partie N°4
---
classDiagram
namespace app {
    class Application {
        +main(String[] args)$ void
    }
}
namespace models {
    class Chien {
        -String nom
        -int age
        Chien(String nom, int age)
        +aboyer() void
        +dormir() void
        +manger() void
        +reveiller() void
        +getNom() String
        +getAge() int
    }
}
```
```mermaid
---
title: Situation après partie N°4
---
classDiagram
namespace app {
    class Application {
        +main(String[] args)$ void
    }
}
namespace models {
    class Chien {
        -String nom
        -int age
        -boolean dort
        Chien(String nom, int age)
        +aboyer() void
        +dormir() void
        +manger() void
        +reveiller() void
        +getNom() String
        +getAge() int
    }
}
```

# RETOURNER A LA CONSIGNE :
[Retourner à la consigne pour répondre aux questions](README.md)
