# INTRODUÇÃO AO SPRING

## CONCEITO DE INTERFACES E CLASSES ABSTRATAS

### O que é uma interface?

#### É um tipo especial de classe que define uma série de ações que outras classes deverão implementar. Ela fornece uma garantia de que as classes que a implementam irão fornecer ações específicas, mas permite que cada classe as implemente de forma individual.

### O que é uma classe abstrata?

#### Classe abstrtata é uma classe que não pode ser instanciada diretamente. Ou seja, você não pode criar objetos a partir dela.

#### INSTANCIAR => CRIAR OBJETSO!

### Em vez disso, as classes abstratas servem como modelos para outras classes quer podem herdar seus atributos e comportamentos.

### Diferenças entre classes abstratas e interfaces.

#### 1. Herança única versus Múltipla Implementação. Uma classe pode herdar apenas de uma classe "mãe", mas pode implementar várias interfaces.

#### Isso significa que as interfaces permitem que uma classe implemente vários comportamentos.

#### Métodos abstratos. Ambas as classes abstratas e as interfaces podem conter métodos abstratos. No entanto, as classes abstratas também podem conter métodos concretos com implementação de código. Enquanto as interfaces só podem conter métodos abstratos.

### Pra que servem as classes abstratas de interfaces?

#### As classes abstratas são usadas para fornecer uma estrutura geral pra outras classes.

#### As interfaces são usadas para garantir que certos comportamentos sejam implementados em várias classes.

#### As classes abstratas podem fornecer implementações de código para comportamentos padrão que podem ser herdados e usadas por classes filhas.

#### As interfaces não fornecem implementações de códigos, apenas definem os COMPORTAMENTOS que devem ser implementados.