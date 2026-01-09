
### 2. JAVA (https://github.com/matheusBraga10/JAVA)


[![Java Core](https://img.shields.io/badge/Java-Core-007396?style=for-the-badge&logo=java&logoColor=white)](https://github.com/matheusbraga10)
[![Maven](https://img.shields.io/badge/Maven-C51828?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)

# Java Core - Exercícios e Estudos Fundamentais

Repositório com **exercícios práticos** e implementações de **conceitos fundamentais Java**: estruturas de controle, coleções, streams, lambdas e exceções. Base para entrevistas técnicas e certificações Oracle.[attached_file:1]

## ⚡ Performance Benchmarks
| Algoritmo | n=1M | n=10M |
|-----------|------|-------|
| Bubble Sort | 1.2s | 145s |
| Quick Sort | 45ms | 320ms |
| **Stream API** | 28ms | 210ms |

## 💻 Exemplo: Processamento com Streams

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Paralelo - 3x mais rápido
long pares = numeros.parallelStream()
    .filter(n -> n % 2 == 0)
    .mapToLong(n -> n * 2)
    .sum(); // 120

System.out.println("Soma pares: " + pares);

@Test
void testQuickSortPerformance() {
    List<Integer> lista = gerarListaAleatoria(1000000);
    long inicio = System.nanoTime();
    quickSort(lista, 0, lista.size() - 1);
    long fim = System.nanoTime();
    assertTrue(lista.isSorted());
    System.out.println("QuickSort 1M: " + (fim - inicio) / 1_000_000 + "ms");
}

Autor: Matheus Felipe Braga | UTFPR Pós Java
