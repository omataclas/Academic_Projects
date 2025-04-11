
class FilaMatrizCircular:
    # Cria uma fila vazia, utilizando a estrutura de uma matriz circular
    CAPACIDADE = 10  # limite de capacidade das filas novas

    def __init__(self):
        self.data = [None] * FilaMatrizCircular.CAPACIDADE
        self.tamanho = 0
        self.frente = 0

    # Retorna quantos elementos tem na fila.
    def __len__(self):
        return self.tamanho

    # Se a fila estiver vazia retorna True, senão retorna False.
    def estaVazia(self):
        return self.tamanho == 0

    # Retorna o primeiro elemento da fila, sem removê-lo
    def primeiro(self):
        if self.estaVazia():
            raise Exception("Fila vazia!")
        return self.data[self.frente]

    # Insere um elemento na fila.
    def enfilera(self, e):
        if self.tamanho == len(self.data):
            self.redimensiona(2 * len(self.data))  # duplica o tamanho da matriz
        avail = (self.frente + self.tamanho) % len(self.data)
        self.data[avail] = e
        self.tamanho += 1

    # Remove e retorna o primeiro elemento da fila.
    def desenfileira(self):
        if self.estaVazia():
            raise Exception("Fila vazia!")
        resposta = self.data[self.frente]
        self.data[self.frente] = None  # ajuda na coleta de lixo
        self.frente = (self.frente + 1) % len(self.data)
        self.tamanho -= 1
        return resposta

    # Redimensiona a lista, cap >= len(self)
    def redimensiona(self, cap):
        antiga = self.data  # mantém o registro da lista existente
        self.data = [None] * cap  # aloca uma lista com nova capacidade
        anda = self.frente
        for k in range(self.tamanho):  # com base nos elementos existentes
            self.data[k] = antiga[anda]  # altera os índices
            anda = (1 + anda) % len(antiga)  # usa o tamanho antigo como módulo
        self.frente = 0  # realinha a frente


# Exemplo de uso da classe FilaMatrizCircular
def exemplo_uso_fila():
    fila = FilaMatrizCircular()

    # Adiciona elementos à fila
    fila.enfilera(0)
    fila.enfilera(9)
    fila.enfilera(1)
    fila.enfilera(1)

    # Verifica se a fila está vazia
    print("A fila está vazia: " + str(fila.estaVazia()))  # Saída: False

    # Obtém o tamanho da fila
    print("O tamanho da fila é: " + str(len(fila)))  # Saída: 4

    # Remove elementos da fila
    print("Removendo o número: " + str(fila.desenfileira()))  # Saída: 0
    print("Removendo o número: " + str(fila.desenfileira()))  # Saída: 9

    # Tamanho da fila após remoções
    print("Atual tamanho da fila: " + str(len(fila)))  # Saída: 2


# Chama a função de exemplo para testar o código
exemplo_uso_fila()