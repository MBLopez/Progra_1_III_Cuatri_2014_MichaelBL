package appejerciciosswitch;

/**
 *
 * @author MG
 */
public class clsEjeSwitch {
    /*Variables*/

    int N = 0, NUMERO=0;
    /*Método constructor*/

    public clsEjeSwitch(int A, String L) {
        this.N = A;
    }
    /*Método para retornarle al usuario el nombre de un mes de acuerdo a número digitado*/

    public String retornaMes() {
        int A = this.N - 1;
        String arregloMes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String sec = arregloMes[A];

        return sec;
    }
    /*Método que retorna el valor de una multiplicación valorando si es 2-5-8 multiplicar la cifra por si misma
     y si es 4-7-9 multiplicar la cifra por 5*/

    public int retornaCuadrado() {
        int r = 0;
        int t = this.N;
        do {
            if (N == 2 || N == 5 || N == 8) {
                r = t * t;
                return r;
            } else {
                if (N == 4 || N == 7 || N == 9) {
                    r = t * 5;
                    return r;
                } else {
                    this.N = this.N - 10;
                    if (N == 2 || N == 5 || N == 8) {
                        r = t * t;
                        return r;
                    } else {
                        if (N == 4 || N == 7 || N == 9) {
                            r = t * 5;
                            this.NUMERO=r;
                            return r;
                        }
                    }
                }
            } 
        } while (N > 10);
        return r;
    } 
    /*Método para comparar letra desde A-E y devolver un mensaje*/

    public String condicion(String letra) {
        String sec = "";
        if (letra.equals("a") || letra.equals("A")) {
            sec = "excelente";
        } else {
            if (letra.equals("b") || letra.equals("B")) {
                sec = "bueno";
            } else {
                if (letra.equals("c") || letra.equals("C")) {
                    sec = "regular";
                } else {
                    if (letra.equals("d") || letra.equals("D")) {
                        sec = "malo";
                    } else {
                        if (letra.equals("e") || letra.equals("E")) {
                            sec = "pésimo";
                        }
                    }
                }
            }
        }
        return sec;
    }
    /*Método para retornar el número de días que tiene el mes de acuerdo al número de mes y año*/

    public String numDiasMes(int A, int B) {
        int r = 0, año = A, mes = B;
        String sec = "";
        int diasMeses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String nomMeses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        if (año % 4 == 0) {
            diasMeses[1] = 29;
            sec = nomMeses[mes - 1] + " son " + diasMeses[mes - 1];

        } else {
            sec = nomMeses[mes - 1] + " son " + diasMeses[mes - 1];
        }

        return sec;
    }
    /*Método para retornar un número aleatorio y su equivalente en romanos*/

    public String aleatorioRomano(int A) {
        int n = A;
        String r = "", t = "";
        String Miles[] = {"M", "MM"};
        String Centenas[] = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String Decenas[] = {"IX", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String Unidades[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        if (n >= 2000) {
            n = n - 2000;
            t = Miles[1];
        }
        if (n >= 1000 && n < 2000) {
            n = n - 1000;
            t = t + Miles[0];
        }
        if (n >= 500 && n < 1000) {

            if (n > 900) {
                n = n - 900;
                t = t + Centenas[8];
            }
            if (n > 800 && n < 900) {
                n = n - 800;
                t = t + Centenas[7];
            }
            if (n > 700 && n < 800) {
                n = n - 700;
                t = t + Centenas[6];
            }
            if (n > 600 && n < 700) {
                n = n - 600;
                t = t + Centenas[5];
            }
            if (n >= 500 && n < 600) {
                n = n - 500;
                t = t + Centenas[4];
            }
        }
        if (n >= 100 && n < 500) {
            if (n >= 400 && n < 500) {
                n = n - 400;
                t = t + Centenas[3];
            }
            if (n >= 300 && n < 400) {
                n = n - 300;
                t = t + Centenas[2];
            }
            if (n >= 200 && n < 300) {
                n = n - 200;
                t = t + Centenas[1];
            }
            if (n >= 100 && n < 200) {
                n = n - 100;
                t = t + Centenas[0];
            }
        }
        if (n > 10 && n < 100) {
            if (n >= 90 && n < 100) {
                n = n - 90;
                t = t + Decenas[8];
            }
            if (n >= 80 && n < 90) {
                n = n - 80;
                t = t + Decenas[7];
            }
            if (n >= 70 && n < 80) {
                n = n - 70;
                t = t + Decenas[6];
            }
            if (n >= 60 && n < 70) {
                n = n - 60;
                t = t + Decenas[5];
            }
            if (n >= 50 && n < 60) {
                n = n - 50;
                t = t + Decenas[4];
            }
            if (n >= 40 && n < 50) {
                n = n - 40;
                t = t + Decenas[3];
            }
            if (n >= 30 && n < 40) {
                n = n - 30;
                t = t + Decenas[2];
            }
            if (n >= 20 && n < 40) {
                n = n - 20;
                t = t + Decenas[1];
            }
            if (n > 10 && n < 20) {
                n = n - 10;
                t = t + Decenas[0];
            }
        }
        if (n <= 10) {

            t = t + Unidades[n - 1];
        }
        r = r + t;
        return r;
    }
    /*Método para mostrar fecha del día anterior en formato 12-11-2014*/

    public String fechaAnterior(int A, int B, int C) {
        int r = 0, dia = A, mes = B, año = C;
        String sec = "";
        int diasMeses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (año % 4 == 0 && mes == 3 && dia == 1) {
            dia = diasMeses[1] = 29;
            mes--;
            sec = dia + "/" + mes + "/" + año;

        } else {
            if (dia == 1 && mes == 1) {
                dia = diasMeses[11];
                mes = 12;
                año--;
                sec = dia + "/" + mes + "/" + año;

            } else {
                if (dia == 1 && mes == 2) {
                    dia = diasMeses[mes - 2];
                    mes--;
                    sec = dia + "/" + mes + "/" + año;
                } else {
                    if (dia == 1 && mes == 4) {
                        dia = diasMeses[mes - 2];
                        mes--;
                        sec = dia + "/" + mes + "/" + año;
                    } else {
                        if (dia == 1 && mes == 5) {
                            dia = diasMeses[mes - 2];
                            mes--;
                            sec = dia + "/" + mes + "/" + año;
                        } else {
                            if (dia == 1 && mes == 6) {
                                dia = diasMeses[mes - 2];
                                mes--;
                                sec = dia + "/" + mes + "/" + año;
                            } else {
                                if (dia == 1 && mes == 7) {
                                    dia = diasMeses[mes - 2];
                                    mes--;
                                    sec = dia + "/" + mes + "/" + año;
                                } else {
                                    if (dia == 1 && mes == 8) {
                                        dia = diasMeses[mes - 2];
                                        mes--;
                                        sec = dia + "/" + mes + "/" + año;
                                    } else {
                                        if (dia == 1 && mes == 9) {
                                            dia = diasMeses[mes - 2];
                                            mes--;
                                            sec = dia + "/" + mes + "/" + año;
                                        } else {
                                            if (dia == 1 && mes == 10) {
                                                dia = diasMeses[mes - 2];
                                                mes--;
                                                sec = dia + "/" + mes + "/" + año;
                                            } else {
                                                if (dia == 1 && mes == 11) {
                                                    dia = diasMeses[mes - 2];
                                                    mes--;
                                                    sec = dia + "/" + mes + "/" + año;
                                                } else {
                                                    if (dia == 1 && mes == 12) {
                                                        dia = diasMeses[mes - 2];
                                                        mes--;
                                                        sec = dia + "/" + mes + "/" + año;
                                                    } else {
                                                        dia--;
                                                        sec = dia + "/" + mes + "/" + año;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return sec;
    }
    /*Método para mostrar el día de la semana que corresponde*/

    public String diasemana(int A) {
        String sec = "";
        int j = 0, i = 0;
        String diaSemana[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        do {
            sec = diaSemana[i];

            j++;
            i++;
            if (i == 7) {
                i = 0;
            }

        } while (j < A);

        return sec;
    }
    /*Método para mostrar el día de la semana actual de acuerdo al día dado por el usuario
     y por la fecha del día actual*/

    public String diaActual(String letra, int A) {
        String sec = "";
        int i = 0, j = 0;

        if (letra.equals("lunes") || letra.equals("Lunes")) {
            String diaSemana[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
            do {
                sec = diaSemana[i];
                j++;
                i++;
                if (i == 7) {
                    i = 0;
                }

            } while (j < A);
        } else {
            if (letra.equals("martes") || letra.equals("Martes")) {
                String diaSemana[] = {"Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo", "Lunes"};
                do {
                    sec = diaSemana[i];

                    j++;
                    i++;
                    if (i == 7) {
                        i = 0;
                    }

                } while (j < A);
            } else {
                if (letra.equals("miércoles") || letra.equals("Miércoles") || letra.equals("miercoles") || letra.equals("Miercoles")) {
                    String diaSemana[] = {"Miércoles", "Jueves", "Viernes", "Sábado", "Domingo", "Lunes", "Martes"};
                    do {
                        sec = diaSemana[i];

                        j++;
                        i++;
                        if (i == 7) {
                            i = 0;
                        }

                    } while (j < A);
                } else {
                    if (letra.equals("jueves") || letra.equals("Jueves")) {
                        String diaSemana[] = {"Jueves", "Viernes", "Sábado", "Domingo", "Lunes", "Martes", "Miércoles"};
                        do {
                            sec = diaSemana[i];

                            j++;
                            i++;
                            if (i == 7) {
                                i = 0;
                            }

                        } while (j < A);
                    } else {
                        if (letra.equals("viernes") || letra.equals("Viernes")) {
                            String diaSemana[] = {"Viernes", "Sábado", "Domingo", "Lunes", "Martes", "Miércoles", "Jueves"};
                            do {
                                sec = diaSemana[i];

                                j++;
                                i++;
                                if (i == 7) {
                                    i = 0;
                                }

                            } while (j < A);
                        } else {
                            if (letra.equals("sábado") || letra.equals("Sábado") || letra.equals("sabado") || letra.equals("Sabado")) {
                                String diaSemana[] = {"Sábado", "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
                                do {
                                    sec = diaSemana[i];

                                    j++;
                                    i++;
                                    if (i == 7) {
                                        i = 0;
                                    }

                                } while (j < A);
                            } else {
                                String diaSemana[] = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
                                do {
                                    sec = diaSemana[i];

                                    j++;
                                    i++;
                                    if (i == 7) {
                                        i = 0;
                                    }

                                } while (j < A);
                            }
                        }
                    }
                }
            }
        }
        return sec;
    }

    public void setNUMERO(int NUMERO) {
        this.NUMERO = NUMERO;
    }

}
