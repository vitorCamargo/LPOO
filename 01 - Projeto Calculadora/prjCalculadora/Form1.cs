using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace prjCalculadora
{
    public partial class Form1 : Form
    {
        // a linha abaixo inicial um objeto
        // calculadora no formulario com o nome de c
        Calculadora c = new Calculadora("0", 0, "");

        public Form1()
        {
            InitializeComponent();
        }        

        private void bt2_Click(object sender, EventArgs e)
        {
            c.setDigito(bt2);
            lbVisor.Text = c.Visor;
        }

        private void bt3_Click(object sender, EventArgs e)
        {
            c.setDigito(bt3);
            lbVisor.Text = c.Visor;
        }

        private void bt1_Click(object sender, EventArgs e)
        {
            c.setDigito(bt1);
            lbVisor.Text = c.Visor;
        }

        private void bt0_Click(object sender, EventArgs e)
        {
            c.setDigito(bt0);
            lbVisor.Text = c.Visor;
        }

        private void bt4_Click(object sender, EventArgs e)
        {
            c.setDigito(bt4);
            lbVisor.Text = c.Visor;
        }

        private void bt5_Click(object sender, EventArgs e)
        {
            c.setDigito(bt5);
            lbVisor.Text = c.Visor;
        }

        private void bt6_Click(object sender, EventArgs e)
        {
            c.setDigito(bt6);
            lbVisor.Text = c.Visor;
        }

        private void bt7_Click(object sender, EventArgs e)
        {
            c.setDigito(bt7);
            lbVisor.Text = c.Visor;
        }

        private void bt8_Click(object sender, EventArgs e)
        {
            c.setDigito(bt8);
            lbVisor.Text = c.Visor;
        }

        private void bt9_Click(object sender, EventArgs e)
        {
            c.setDigito(bt9);
            lbVisor.Text = c.Visor;
        }

        private void btSomar_Click(object sender, EventArgs e)
        {
            c.setOperacao(btSomar);
        }

        private void btSubtrair_Click(object sender, EventArgs e)
        {
            c.setOperacao(btSubtrair);
        }

        private void btmultiplicar_Click(object sender, EventArgs e)
        {
            c.setOperacao(btMultiplicar);
        }

        private void btdividir_Click(object sender, EventArgs e)
        {
            c.setOperacao(btdividir);
        }

        private void btCalcular_Click(object sender, EventArgs e)
        {
            c.calcular();
            lbVisor.Text = c.Visor;
        }

        private void btPonto_Click(object sender, EventArgs e)
        {
            c.pontoDecimal();
            lbVisor.Text = c.Visor;
        }

        private void btRaiz_Click(object sender, EventArgs e)
        {
            c.raiz();
            lbVisor.Text = c.Visor;
        }

        private void btC_Click(object sender, EventArgs e)
        {
            //ajusta o visor para conter 0
            c.Visor = "0";
            //ajusta o visor com as informacoes atualizadas
            lbVisor.Text = c.Visor;
        }

        private void btCE_Click(object sender, EventArgs e)
        {
            //recria o objeto pelo construtor 
            c = new Calculadora("0", 0, "");
            //ajustar o visor com as informacoes 
            lbVisor.Text = c.Visor;
        }

        private void btBK_Click(object sender, EventArgs e)
        {
            c.backspace();
            lbVisor.Text = c.Visor;
        }

        private void btSeno_Click(object sender, EventArgs e)
        {
            c.seno();
            lbVisor.Text = c.Visor;
        }

        private void btCosseno_Click(object sender, EventArgs e)
        {
            c.cosseno();
            lbVisor.Text = c.Visor;
        }

        private void btTangente_Click(object sender, EventArgs e)
        {
            c.tangente();
            lbVisor.Text = c.Visor;
        }        
    }
}
