
/**
 * Escreva uma descrição da classe Artista aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Artista
{
    public void desenharFiguraEmPartes(){
        desenharRosto();
        desenharNariz();
        desenharOlho1();
        desenharOlho2();
        desenharBoca();
    }  

    private void desenharRosto(){
        Circle rosto = new Circle();
        rosto.makeVisible();
        rosto.changeSize(150);
        rosto.moveRight();
        rosto.moveRight();
        rosto.moveRight();
    }

    private void desenharOlho1(){
        Circle olho = new Circle();
        olho.makeVisible();
        olho.changeColor("green");
        olho.moveRight();
        olho.moveRight();
        olho.moveRight();
        olho.moveRight();
        olho.moveDown();
        olho.moveDown();
    }

    private void desenharOlho2(){
        Circle olho = new Circle();
        olho.makeVisible();
        olho.changeColor("green");
        olho.moveRight();
        olho.moveRight();
        olho.moveRight();
        olho.moveRight();
        olho.moveRight();
        olho.moveRight();
        olho.moveRight();
        olho.moveRight();
        olho.moveDown();
        olho.moveDown();
    }

    private void desenharNariz(){
        Triangle nariz = new Triangle();
        nariz.makeVisible();
        nariz.changeColor("yellow");
        nariz.changeSize(20,20);
        nariz.moveRight();
        nariz.moveRight();
        nariz.moveRight();
        nariz.moveRight();
        nariz.moveRight();
        nariz.slowMoveHorizontal(4);
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
    }

    private void desenharBoca(){
        Square boca = new Square();
        boca.makeVisible();
        boca.moveRight();
        boca.moveRight();
        boca.moveRight();
        boca.moveRight();
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
    }

    public void desenharFigura()
    {
        Circle rosto = new Circle();
        rosto.makeVisible();
        rosto.changeSize(150);
        Circle olhoEsquerdo = new Circle();
        olhoEsquerdo.makeVisible();
        olhoEsquerdo.changeColor("green");
        olhoEsquerdo.moveDown();
        olhoEsquerdo.moveRight();
        Circle olhoDireito = new Circle();
        olhoDireito.makeVisible();
        olhoDireito.changeColor("green");
        olhoDireito.moveDown();
        olhoDireito.moveRight();
        olhoDireito.moveRight();
        olhoDireito.moveRight();
        olhoDireito.moveRight();
        olhoDireito.moveRight();
        Triangle nariz = new Triangle();
        nariz.makeVisible();
        nariz.changeColor("black");
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveDown();
        nariz.moveRight();
        nariz.moveRight();
        Square boca = new Square();
        boca.makeVisible();
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
        boca.moveDown();
        boca.moveRight();

    }
}
