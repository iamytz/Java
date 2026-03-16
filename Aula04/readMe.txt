jubileu deposita inicialmente 300
Creusa deposita inicialmente 500

jubileu abre conta poupança
creusa abre conta corrente

cada um precisa abrir conta primeiro
creusa precisa de 100 reais para comprar um sapato novo //not importante

classe contabanco
numConta
tipo
nomeDono
saldo
status - aberta ou fechada

metodos
abrirConta()
fecharConta()
depositar()
sacar()
pagarMensalidade()

tipo da conta
cc - conta corrente
cp - conta poupança

conta corrente ganha 50 reais de inicio
conta poupança ganhas 150 reais de inicio

fecharConta()
nao pode ter dinheiro, precisa sacar
nao pode ter dividas

depositar()
tem que estar aberta status true

sacar()
tem que ter saldo saldo >= deposito
tem que estar aberta status true

pagarMensalidade()
desconta do saldo
conta corrente 12
conta poupança 20

visibilidades

+ numConta
# tipo
- nomeDono
-saldo
-status

todos metodos sao publicos

getters e setters para cada

contruct
sempre que uma conta for criada status false saldo
