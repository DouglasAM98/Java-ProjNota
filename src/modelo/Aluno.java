package modelo;

import java.util.ArrayList;

/**
 *
 * @author Elvis
 * @version Beta
 * @since 19/04/2018
 */
public class Aluno
{
    private String nome, sobrenome, sexo;
    private ArrayList<String> disciplinas;
    private double n1, n2, p1, p2;
    private int totalAulas, numPresencas;

    public Aluno()
    {
    }

    /**
     * 
     * @param nome Nome do aluno
     * @param sobrenome Sobrenome do aluno
     * @param sexo Sexo do aluno
     * @param disciplinas Disciplinas que o aluno fez
     * @param n1 Primeira nota do aluno
     * @param n2 Segunda nota do aluno
     * @param p1 Peso da primeira nota
     * @param p2 Peso da segunda nota
     * @param totalAulas Total de aulas
     * @param numPresencas Numero de presença do aluno
     */
    public Aluno(String nome, String sobrenome, String sexo, ArrayList<String> disciplinas, double n1, double n2, double p1, double p2, int totalAulas, int numPresencas)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.disciplinas = disciplinas;
        this.n1 = n1;
        this.n2 = n2;
        this.p1 = p1;
        this.p2 = p2;
        this.totalAulas = totalAulas;
        this.numPresencas = numPresencas;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }

    public String getSexo()
    {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public ArrayList<String> getDisciplinas()
    {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas)
    {
        this.disciplinas = disciplinas;
    }

    public double getN1()
    {
        return n1;
    }

    public void setN1(double n1)
    {
        this.n1 = n1;
    }

    public double getN2()
    {
        return n2;
    }

    public void setN2(double n2)
    {
        this.n2 = n2;
    }

    public double getP1()
    {
        return p1;
    }

    public void setP1(double p1)
    {
        this.p1 = p1;
    }

    public double getP2()
    {
        return p2;
    }

    public void setP2(double p2)
    {
        this.p2 = p2;
    }

    public int getTotalAulas()
    {
        return totalAulas;
    }

    public void setTotalAulas(int totalAulas)
    {
        this.totalAulas = totalAulas;
    }

    public int getNumPresencas()
    {
        return numPresencas;
    }

    public void setNumPresencas(int numPresencas)
    {
        this.numPresencas = numPresencas;
    }
    
    /**
     * 
     * @return Calcula a média aritmética
     */
    public double calcularMediaAritmetica()
    {
        return (n1 + n2) / 2;
    } // fecha calcularMediaAritmetica
    
    /**
     * 
     * @return Calcula a média ponderada do aluno
     */
    public double calcularMediaPonderada()
    {
        return ((n1 * p1) + (n2 * p2)) / (p1 + p2);
    } // fecha calcularMediaPonderada
    
    /**
     * 
     * @return Verifica a frequência do aluno e retorna um numero entre 0 e 1.0
     */
    public double verificarFrequencia()
    {
        return (double)numPresencas / (double)totalAulas;
    } // fecha verificarFrequencia
    
    /**
     * 
     * @return Verifica a aprovação/reprovação por nota e por presenças
     */
    public String verificarAprovacao()
    {
        String msg = "";
        double media = calcularMediaAritmetica();
        double frequencia = verificarFrequencia();
        
        if(media >= 6.0) msg += "Aprovado por Nota - ";
        else msg += "Reprovado por Nota - ";
        
        if(frequencia >= 0.75) msg += "Aprovado por presença";
        else msg += "Reprovado por falta";
        
        return msg;
    } // fecha verificarAprovacao
    
    /**
     * 
     * @return Verifica a nota de conceito do aluno de A até C
     */
    public String verificarConceito()
    {
        String msg = "";
        double media = calcularMediaAritmetica();
        
        if(media >= 9.0) msg = "A";
        else if(media >= 8.0 && media <= 8.9) msg = "B";
        else if(media >= 6.0 && media <= 7.9) msg = "C";
        else msg = "D";
        
        return msg;
    } // fecha verificarConceito

    /**
     * 
     * @param a recebe o divisor
     * @param b recebe o dividendo
     * @return retorna a divisão de a por b
     * @throws ArithmeticException pode ocorrer o erro de divisão por 0
     * @exception exeção
     */
    public int dividir(int a, int b) throws ArithmeticException{
        int resp = 0;
        try {
            resp = a/b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Divisão por zero!");
        }//fecha catch
        return resp;
    }
    
    @Override
    public String toString()
    {
        String disciplinasTexto = "";
        if(disciplinas.size() <= 0)
        {
            disciplinasTexto = "Nenhuma disciplina";
        }
        else 
        {
            for(int i = 0; i < disciplinas.size(); i++)
            {
                disciplinasTexto += "\n - " + disciplinas.get(i);
            }
        }
        
        return    "\nNome: " + nome 
                + "\nSobrenome: " + sobrenome 
                + "\nSexo: " + sexo 
                + "\nDisciplinas: " + disciplinasTexto 
                + "\nN1: " + n1 
                + "\nN2: " + n2 
                + "\nP1: " + p1 
                + "\nP2: " + p2 
                + "\nTotal de Aulas: " + totalAulas 
                + "\nNumero de Presenças: " + numPresencas
                + "\nMédia Aritmética: " + calcularMediaAritmetica()
                + "\nMédia Ponderada: " + calcularMediaPonderada()
                + "\nAprovação: " + verificarAprovacao()
                + "\nConceito: " + verificarConceito()
                + "\nFrequência: " + verificarFrequencia() * 100 + "%";
    }// fecha toString
} // fecha classe Aluno
