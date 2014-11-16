package pkg1examen;

/**
 *
 * @author MG
 */
public class cls1Examen {
/*variables*/

    byte saltos = 0;
    int numeros[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    String palabra = "";
    String abecedario[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    int billetes[] = {5000, 2000, 1000, 500, 100, 50, 25};
    
    /*Método constructor*/

    public cls1Examen(String pal, byte n) {
        this.palabra = pal;
        this.saltos = n;

    }
    /*Método para hubicar las letras en la matriz y devolver la criptografia*/

    public String encriptar() {
        String r = "", t = "";
        char temp;
        int tem;
        int j = 0, i = 0;
        while (j < palabra.length()) {
            temp = palabra.charAt(j);
            tem = numeros[j];
            while (i < 26) {
                t += temp;
                if (i < 24 && (i + saltos <= 25)) {
                    if (t.equals(abecedario[i])) {
                        r += abecedario[i + saltos];
                        i = 0;
                        t = "";
                        break;
                    } else {
                        i++;
                        t = "";
                    }
                } else {
                    if (saltos >= 5 || i == 21) {
                        if (t.equals(abecedario[i])) {
                            r += abecedario[saltos - 4];
                            i = 0;
                            t = "";
                            break;
                        }
                    }
                    if (saltos >= 5 || i == 22) {
                        if (t.equals(abecedario[i])) {
                            r += abecedario[25 - saltos];
                            i = 0;
                            t = "";
                            break;
                        }
                    }
                    if (i == 23 || i == 24) {
                        if (t.equals(abecedario[i])) {
                            r += abecedario[25 - saltos];
                            i = 0;
                            t = "";
                            break;
                        } else {
                            i++;
                            t = "";
                        }
                    } else {
                        if (i == 25) {
                            if (t.equals(abecedario[i])) {
                                r += abecedario[saltos - 1];
                                t = "";
                                break;
                            } else {
                                i = 0;
                                t = "";
                            }
                        }
                    }
                }
            }
            j++;
        }
        return r + t;
    }
    /*Método para pasar una cantidad de billetes a su valor en letras*/

    public String pasarAletras(int monto) {
        String r = "", enletras = "", detalle = "";
        int resta = 0;
        if (monto == 10000) {
            r = "2 billetes de 5000";
            detalle = "Diez mil ";
        }
        if (monto >= 9000 && monto < 10000) {
            monto = monto - 9000;
            enletras = "1 billete de 5000" + '\n' + "2 billetes de 2000";
            detalle = "Nueve mil ";
        }
        if (monto >= 8000 && monto < 9000) {
            monto = monto - 8000;
            enletras += "1 billete de 5000" + '\n' + "1 billete de 2000" + '\n' + "1 billete de mil";
            detalle += "Ocho mil ";
        }
        if (monto >= 7000 && monto < 8000) {
            monto = monto - 7000;
            enletras += "1 billete de 5000" + '\n' + "1 billete de 2000";
            detalle += "Siete mil ";
        }
        if (monto >= 6000 && monto < 7000) {
            monto = monto - 6000;
            enletras += "1 billete de 5000" + '\n' + "1 billete de 1000";
            detalle += "Seis mil ";
        }
        if (monto == 5000) {
            enletras += "1 billete de 5000";
            detalle += "Cinco mil ";
        }
        if (monto > 5000 && monto < 6000) {
            monto = monto - 5000;
            enletras += "1 billete de 5000";
            detalle += "Cinco mil ";
        }
        if (monto == 4000) {
            enletras += "2 billetes de 2000";
            detalle += "Cuatro mil ";
        }
        if (monto > 4000 && monto < 5000) {
            monto = monto - 4000;
            enletras += "2 billetes de 2000";
            detalle += "Cuatro mil ";
        }
        if (monto == 3000) {
            enletras += "1 billete de 2000" + '\n' + "1 billete de 1000";
            detalle += "Tres mil ";
        }
        if (monto > 3000 && monto < 4000) {
            monto = monto - 3000;
            enletras += "1 billete de 2000" + '\n' + "1 billete de 1000" + '\n';
            detalle += "Tres mil ";
        }
        if (monto == 2000) {
            enletras += '\n' +"1 billete de 2000";
            detalle += "Dos mil ";
        }
        if (monto > 2000 && monto < 3000) {
            monto = monto - 2000;
            enletras += '\n' +"1 billete de 2000";
            detalle += "Dos mil ";
        }
        if (monto == 1000) {
            enletras += '\n' +"1 billete de 1000";
            detalle += "Mil ";
        }
        if (monto > 1000 && monto < 2000) {
            monto = monto - 1000;
            enletras += '\n' +"1 billete de 1000";
            detalle += "Mil ";
        }
        if (monto > 500 && monto < 1000) {
            monto = monto - 500;
            enletras += '\n' +"1 moneda de 500";
            detalle += "Quinientos ";
        }
        if (monto == 500) {
            enletras += '\n' +"1 moneda de 500";
            detalle += "Quinientos ";
        }
        if (monto >= 400 && monto < 500) {
            monto = monto - 400;
            enletras += '\n' +"4 monedas de 100";
            detalle += "Cuatrocientos ";
        }
        if (monto >= 300 && monto < 400) {
            monto = monto - 300;
            enletras += '\n' +"3 monedas de 100";
            detalle += "Trescientos ";
        }
        if (monto >= 200 && monto < 300) {
            monto = monto - 200;
            enletras += '\n' +"2 monedas de 100";
            detalle += "Doscientos ";
        }
        if (monto >= 100 && monto < 200) {
            monto = monto - 100;
            enletras += '\n' +"1 moneda de 100";
            detalle += "Ciento ";
        }
        if (monto == 100) {
            enletras += '\n' +"1 moneda de 100";
            detalle += "Cien ";
        }
        if (monto==75) {
            monto = monto - 50;
            enletras += '\n' +"1 moneda de 50" + '\n' + "1 moneda de 25";
            detalle += "setenta y cinco ";
        }
        if (monto ==50){
            enletras += '\n' +"1 moneda de 50";
            detalle += "cincuenta ";
        }
        if (monto ==25){
            enletras += '\n' +"1 moneda de 25";
            detalle += "veinte y cinco ";
        }
        if(monto>50&&monto<80){
            monto=monto-50;
            enletras += '\n' + "1 moneda de 50";
            }
        
        r += enletras + '\n' + detalle + " colones";
        return r ;
        }
         
    }
