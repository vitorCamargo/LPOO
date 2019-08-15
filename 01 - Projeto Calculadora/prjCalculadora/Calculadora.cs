using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Threading.Tasks;

namespace prjCalculadora
{
    class Calculadora
    {
        private String visor;

        public String Visor
        {
            get { return visor; }
            set { visor = value; }
        }
        private double aux;

        public double Aux
        {
            get { return aux; }
            set { aux = value; }
        }
        private String op;

        public String Op
        {
            get { return op; }
            set { op = value; }
        }
         
        public Calculadora (String visor, double aux, String op) {
            this.visor = visor;
            this.aux = aux;
            this.op = op;
        }
        
        public void setDigito (Button bt) {
            if (Visor.Equals ("0")) Visor = bt.Text; // se visor vazio substitui o numero pelo digitado 
            else Visor += bt.Text; // acresenta digito a direita 
        }

        public void setOperacao (Button btOperador) {
            Op = btOperador.Text; //joga a operacao matematica
            aux = Convert.ToDouble(Visor); // salva o visor na variavel auxiliar
            Visor = "0"; //zera visor
        }

        public void calcular () {
            double v = Convert.ToDouble(Visor); // pega o visor e converte em numero 
            if (Op.Equals ("+")) Visor = Convert.ToString(aux + v); //somar
            if (Op.Equals ("-")) Visor = Convert.ToString(aux - v); //substrair
            if (Op.Equals ("x")) Visor = Convert.ToString(aux * v); //multiplicar
            if (Op.Equals("/")) Visor = Convert.ToString(v / aux); // dividir
        }

        public void backspace () {
            String novo = Visor.Substring(0, Visor.Length - 1);
            if (novo.Equals("")) novo = "0";
            Visor = novo;
        }
         
        public void pontoDecimal() {
            if (!Visor.Contains(",")) Visor += ",";
        }

        public void seno() {
            double v = Convert.ToDouble(Visor);
            Visor = Math.Sin(v).ToString();
        }

        public void cosseno() {
            double v = Convert.ToDouble(Visor);
            Visor = Math.Cos(v).ToString();
        }

        public void tangente() {
            double v = Convert.ToDouble(Visor);
            Visor = Math.Tan(v).ToString();
        }

        public void raiz()
        {
            double v = Convert.ToDouble(Visor);
            Visor = Math.Sqrt(v).ToString();
        }
    }
}