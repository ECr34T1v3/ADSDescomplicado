//Sistema para gerenciamento de clientes

const input = require('prompt-sync')();

class Cliente {
    criar() {
        var cliente = new Cliente()
        cliente.nome = input("Nome: ");
        cliente.telefone = input("Telefone: ");
        cliente.cpf = input("CPF: ");
    }
}
class Pilha {
    constructor() {
        this.pilha = [];
    }
    incluir() {
        /* Inclui um cliente na pilha */
        var cliente = new Cliente()
        this.pilha.push(cliente);
    }
    consultar() {
        /* Lista todos os itens */
        for (var item in this.pilha) {
            console.log(`\nNome: ${item.nome}`);
            console.log(`Telefone: ${item.telefone}`);
            console.log(`CPF: ${item.cpf}`);
        }
        input();
    }
    excluir() {
        /* Exclui o primeiro item da lista */
        if (this.pilha.length > 0) {
            this.pilha.pop(0);
            console.log("Ítem excluído.");
        } else {
            console.log("Pilha vazia.");
        }
        input();
    }
}
function main() {
    var op, p, cliente;
    cliente = new Cliente();
    p = new Pilha();
    while (true) {
        console.clear();
        console.log("=================");
        console.log("Gerenciar Clientes");
        console.log("=================");
        console.log("1. Incluir: ");
        console.log("\n2. Consultar: ");
        console.log("\n3. Excluir: ");
        console.log("\n4. Sair: ");
        console.log("=================");
        try {
            op = Number.parseInt(input());
            if (op === 1) {
                console.clear();
                cliente.criar();
                p.incluir(cliente);
            } else {
                if (op === 2) {
                    console.clear();
                    p.consultar();
                } else {
                    if (op === 3) {
                        console.clear();
                        p.excluir();
                    } else {
                        if (op === 4) {
                            break;
                        } else {
                            console.log("Opção inválida.");
                        }
                    }
                }
            }
        } catch(e) {
            console.log("Opção inválida, digite um número.");
        }
    }
}
main();