
function No(nome,cpf,telefone) {
    this.nome = nome;
    this.cpf=cpf;
    this.telefone=telefone;
    this.next = null;
}

function Fila() {
    this.cabeca = null;
    this.calda = null;
}

Fila.prototype.adicionar = function(nome, cpf, telefone) {
    var NovoNo = new No(nome,cpf,telefone);

    if (this.cabeca === null) {
        this.cabeca = NovoNo;
        this.calda = NovoNo;
    } else {
        this.calda.next = NovoNo;
        this.calda = NovoNo;
    }
}

Fila.prototype.retirar = function() {
    var NovoNo;
    if (this.cabeca !== null) {
        NovoNo = this.cabeca.data;
        this.cabeca = this.cabeca.next;
    }
    return NovoNo;
}

Fila.prototype.print = function() {
    var curr = this.cabeca;
    while (curr) {
        console.log(curr.nome,curr.cpf,curr.telefone);
        curr = curr.next;
    }
}

var fila = new Fila();
fila.adicionar("joao",231412,124124);
fila.adicionar("maria",14124412,41412412);
fila.print();
fila.retirar();
fila.print();



