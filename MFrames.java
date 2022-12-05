import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class MFrames {
	JFrame mf;
	JButton cal_b,Ms_b,Tc_b,g_b;
	JLabel p1,p2;
	 JFrame f;
	    JButton j1, j2, j3, j4, j5, j6, j7, j8, j9, j0, ja, js, jm, jd, je, c;
	    JTextField jte;
	    JPanel p;
	    JFrame mf1,mf2;
	    JButton crb;
	     JPanel q;
	     JButton jt[];
	     JTextField iot;
	     JLabel stl;
	     JFrame jt1,jt2;
	 	JLabel ex,lt,lk,lf,lc,te;
	 	JTextField val,res1,res2;
	 	JButton br;
	 	JRadioButton rc,rk,rf;
	 	ButtonGroup bc;
	 	 JButton rockButton, paperButton, scissorsButton;
	     JTextField textField, textField2;
	     int compChoice;
	     int playerChoice;
	     JLabel win;
	     JFrame rpf;
	     
	     String winner;
	MFrames() 
	{
		mf=new JFrame("All Calculator");
		mf.setSize(600,600);
		
		mf.setVisible(true);
		mf.setLayout(new GridLayout(2,2));
		
		
		g_b=new JButton("Rock paper scissors");
		//g_b.setBounds(0,0,200,100);
		mf.add(g_b);
		g_b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mf.setVisible(false);
				rpf.setVisible(true);
				
				
			}
		});
		rpf=new JFrame();
	    rpf.setSize(400,500);
	    rpf.setLayout(new FlowLayout());
	    textField = new JTextField(15); 
	    rpf.add(textField);
	    
	    textField2 = new JTextField(15);
	    rpf.add(textField2);
	    
	    win=new JLabel();
	   // win.setBounds(100,300, 200,50);
	    
	    
	    Random randomSeed = new Random();
	    rpf.add(win);
	    rockButton = new JButton("Rock");
	    
	    rpf.add(rockButton);
	    rockButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText(rockButton.getText());
				compChoice = randomSeed.nextInt(3);
				playerChoice=0;
				 if (playerChoice == compChoice) { 
			            winner = "Noone, it's a tie";}
			    else if (compChoice == 1) {
		            winner = "Computer"; 
		        }
				else 
				{
					winner ="Player";
				
			}
				 win.setText("Winner is " + winner + "!");
				 if (compChoice == 0) { 
			            textField2.setText("Computer choice is rock");
			        } else if (compChoice == 1) {
			            textField2.setText("Computer choice is paper");
			        } else {
			            textField2.setText("Computer choice is scissors");
			        }
		}});

	    paperButton = new JButton("Paper");
	    
	    rpf.add(paperButton);
	    paperButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText(paperButton.getText());
				compChoice = randomSeed.nextInt(3);
				playerChoice=1;
				 if (playerChoice == compChoice) { 
			            winner = "Noone, it's a tie";}
			    else if (compChoice == 2) {
		            winner = "Computer"; 
		        }
				else 
				{
					winner ="Player";
				
			}
				 win.setText("Winner is " + winner + "!");
				 if (compChoice == 0) { 
			            textField2.setText("Computer choice is rock");
			        } else if (compChoice == 1) {
			            textField2.setText("Computer choice is paper");
			        } else {
			            textField2.setText("Computer choice is scissors");
			        }
		}
				
			
		});

	    scissorsButton = new JButton("Scissors");
	    
	    rpf.add(scissorsButton);
	    scissorsButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(scissorsButton.getText());
				// TODO Auto-generated method stub
				compChoice = randomSeed.nextInt(3);
				playerChoice=2;
				 if (playerChoice == compChoice) { 
			            winner = "Noone, it's a tie";}
			    else if (compChoice == 0) {
		            winner = "Computer"; 
		        }
				else 
				{
					winner ="Player";
				
			}
				 win.setText("Winner is " + winner + "!");
				 if (compChoice == 0) { 
			            textField2.setText("Computer choice is rock");
			        } else if (compChoice == 1) {
			            textField2.setText("Computer choice is paper");
			        } else {
			            textField2.setText("Computer choice is scissors");
			        }
		
				
			}
		});
		
		
        Ms_b=new JButton("Magic Square");
       // Ms_b.setBounds(0, 100, 200, 100);
        Ms_b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mf.setVisible(false);
				mf1.setVisible(true);
			}
		});
        mf.add(Ms_b);
        mf1=new JFrame("input");
    	mf1.setSize(500,500);
    	stl=new JLabel("Enter size of magic square(>=3)");
    	stl.setBounds(0,100,200,25);
    	mf1.add(stl);
    	mf1.setLayout(null);
    	iot=new JTextField();
    	iot.setBounds(300,100,50,25);
    	mf1.add(iot);
    	//mf1.setVisible(true);
    	mf2=new JFrame("Result");
        crb=new JButton("create");
        crb.setBounds(100,200,100,50);
        crb.addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			mf1.setVisible(false);
    			mf2.setVisible(true);
    	String s=iot.getText();
    	int n=Integer.parseInt(s);
        
    	
                int i, j;
                int[][] a = new int[n][n];
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        a[i][j] = 0;
                    }
                }
		
                i = 0;
                j = n / 2;
                a[i][j] = 1;
                if (n % 2 == 0) {
                    for (i = 0; i < n; i++)
                        for (j = 0; j < n; j++)
                            a[i][j] = (n * i) + j + 1;

                    for (i = 0; i < n / 4; i++)
                        for (j = 0; j < n / 4; j++)
                            a[i][j] = (n * n + 1) - a[i][j];

                    for (i = 0; i < n / 4; i++)
                        for (j = 3 * (n / 4); j < n; j++)
                            a[i][j] = (n * n + 1) - a[i][j];

                    for (i = 3 * n / 4; i < n; i++)
                        for (j = 0; j < n / 4; j++)
                            a[i][j] = (n * n + 1) - a[i][j];

                    for (i = 3 * n / 4; i < n; i++)
                        for (j = 3 * n / 4; j < n; j++)
                            a[i][j] = (n * n + 1) - a[i][j];

                    for (i = n / 4; i < 3 * n / 4; i++)
                        for (j = n / 4; j < 3 * n / 4; j++)
                            a[i][j] = (n * n + 1) - a[i][j];

                } else {
                    int r = 0, c = 0;
                    for (int k = 2; k <= n * n; k++) {
                        if (i == 0 && j == 0) {
                            r = i + 1;
                            c = j;
                        } else if (i == 0) {
                            r = n - 1;
                            c = j - 1;
                        } else if (j == 0) {
                            r = i - 1;
                            c = n - 1;
                        } else {
                            r = i - 1;
                            c = j - 1;
                        }
                        if (a[r][c] > 0) {
                            r = i + 1;
                            c = j;
                        }
                        i = r;
                        j = c;
                        a[i][j] = k;
                    }
                }
                int k, l,g=0;

		jt=new JButton[n*n];
		while(g!=n*n){
                for (k = 0; k < n; k++) {
                    for (l = 0; l < n; l++) {

                       int temp = a[k][l];
                        String st = Integer.toString(temp);
                  

			jt[g]=new JButton(st);
			g++;
                    }
		
		

                }}
	Font f=new Font("Arial",Font.BOLD,48);
	q= new JPanel ();
        GridLayout gl =new GridLayout(n,n);
        q.setLayout(gl);
	
	for(g=0;g<n*n;g++)
	{
		jt[g].setFont(f);
		jt[g].setBackground(Color.WHITE);
		q.add(jt[g]);
		}
	mf2.add(q);
	mf2.pack();
        
			// TODO Auto-generated method stub
			
		}
	});
    mf1.add(crb);
    
    Tc_b=new JButton("Temperature Converter");
	//Tc_b.setBounds(0,200,200,100);
	Tc_b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			mf.setVisible(false);
			jt1.setVisible(true);
			
		}
	});
	
	mf.add(Tc_b);
	jt1=new JFrame("Temperature converter");
	jt1.setSize(500,500);
	//jt1.setVisible(true);
	
	val=new JTextField();
	val.setBounds(50,100,100,30);
	jt1.add(val);
	rc=new JRadioButton("°C");
	rc.setBounds(200,100,75,40);
	rf=new JRadioButton("F");
	rf.setSelected(true);
	rf.setBounds(300,100,75,40);
	rk=new JRadioButton("K");
	rk.setBounds(400,100,75,40);
	bc=new ButtonGroup();
	bc.add(rc);
	bc.add(rf);
	bc.add(rk);
	
	jt1.add(rc);
	jt1.add(rf);
	jt1.add(rk);
	te=new JLabel();
	te.setBounds(0, 0, 200, 50);
	
	
	ex=new JLabel();
	
	ex.setText("(specfic the temperature format)");
	ex.setBounds(150, 160, 200, 50);
	jt1.add(ex);
	
	
	lk=new JLabel("In Kelvin");
	lk.setBounds(100,100,100,50);
	lf=new JLabel("In Fahrenheit");
	lf.setBounds(100,200,100,50);
	lc=new JLabel("In Celisus");
	lc.setBounds(100,300,100,50);
	jt2=new JFrame("Result");
	jt2.setSize(500,500);
	
	res1=new JTextField();
	res2=new JTextField();
	br=new JButton("Check");
	br.setBounds(200,220,100,50);
	br.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s=new String(val.getText());
			try {
				Double n=Double.parseDouble(s);
				jt1.setVisible(false);
				jt2.setVisible(true);
				if(rk.isSelected()) {
					Double t=n-273.15,t2;
					t2=((t*9.00)/5.00)+ 32.00;
					String sc=Double.toString(t);
					res1.setText(sc);
					res1.setBounds(200,300,200,50);
					jt2.add(lc);
					String sp=Double.toString(t2);
					res2.setText(sp);
					res2.setBounds(200,200,200,50);
					jt2.add(lf);
				}
				else if(rc.isSelected()) {
					Double t=n+273.15,t2;
					t2=((n*9)/5)+ 32;
					String sc=Double.toString(t);
					res1.setText(sc);
					res1.setBounds(200,100,200,50);
					jt2.add(lk);
					String sp=Double.toString(t2);
					res2.setText(sp);
					res2.setBounds(200,200,200,50);
					jt2.add(lf);
				}
				else if(rf.isSelected()){
					Double t=((n-32)*5)/9,t2;
					t2=t+273.15;
					String sc=Double.toString(t);
					res1.setText(sc);
					res1.setBounds(200,300,200,50);
					jt2.add(lc);
					String sp=Double.toString(t2);
					res2.setText(sp);
					res2.setBounds(200,100,200,50);
					jt2.add(lk);
				}
			}
			catch(NumberFormatException ne)
			{
				te.setText("Please enter correct format");
			}
			finally {
			
		}
	}});
	jt1.add(te);
	jt2.add(res1);
	jt2.add(res2);
	jt1.add(br);
	jt1.setLayout(null);
	jt2.setLayout(null);
	
	
	cal_b=new JButton("Calculator");
	//cal_b.setBounds(0,300,200,100);
	cal_b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			mf.setVisible(false);
			f.setVisible(true);
		}
	});
	mf.add(cal_b);
	f = new JFrame("Calculator");
    jte = new JTextField();
    jte.setBounds(0, 0, 200, 150);

    jte.setEditable(false);
    f.add(jte, BorderLayout.NORTH);
    j1 = new JButton("1");
    j2 = new JButton("2");
    j3 = new JButton("3");
    ja = new JButton("+");
    j4 = new JButton("4");
    j5 = new JButton("5");
    j6 = new JButton("6");
    js = new JButton("-");
    j7 = new JButton("7");
    j8 = new JButton("8");
    j9 = new JButton("9");
    jm = new JButton("*");
    j0 = new JButton("0");
    c=new JButton("C");
    

    


    jd = new JButton("/");
  

  je = new JButton("=");
    j1.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+j1.getText();
	    	jte.setText(s);
	    	
	    }
	});
    j2.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+j2.getText();
	    	jte.setText(s);
	    	
	    }
	});
    j3.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+j3.getText();
	    	jte.setText(s);
	    	
	    }
	});
    j4.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+j4.getText();
	    	jte.setText(s);
	    	
	    }
	});
    j5.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+j5.getText();
	    	jte.setText(s);
	    	
	    }
	});
    j6.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+j6.getText();
	    	jte.setText(s);
	    	
	    }
	});
    j7.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+j7.getText();
	    	jte.setText(s);
	    	
	    }
	});
    j8.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+j8.getText();
	    	jte.setText(s);
	    	
	    }
	});
    j9.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+j9.getText();
	    	jte.setText(s);
	    	
	    }
	});
    j0.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+j0.getText();
	    	jte.setText(s);
	    	
	    }
	});
    ja.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+ja.getText();
	    	jte.setText(s);
	    	
	    }
	});
    js.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+js.getText();
	    	jte.setText(s);
	    	
	    }
	});
    jm.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+jm.getText();
	    	jte.setText(s);
	    	
	    }
	});
    jd.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText()+jd.getText();
	    	jte.setText(s);
	    	
	    }
	});
    je.addActionListener(new ActionListener() {
		
		@Override
		 public void actionPerformed(ActionEvent e)
	    {
	    	String s=jte.getText();
	    	String s1="",s2="",so="";
	    	char[] ar=s.toCharArray();
	    	for(int i=0;i<ar.length;i++)
	    	{
	    		if(ar[i]>='0'&&ar[i]<='9')
	    		{
	    			if(so.isEmpty())
	    			{
	    				s1+=ar[i];
	    			}
	    			else
	    			{
	    				s2+=ar[i];
	    			}
	    		}
	    		if(ar[i]=='+'||ar[i]=='-'||ar[i]=='*'||ar[i]=='/')
	    		{
	    			so+=ar[i];
	    		}
	    	}
	    	int i1=Integer.parseInt(s1),i2=Integer.parseInt(s2),res=0;
	    	if(so.equals("+"))
	    		res=i1+i2;
	    	else if(so.equals("-"))
	    		res=i1-i2;
	    	else if(so.equals("*"))
	    		res=i1*i2;
	    	else if(so.equals("/"))
	    		res=i1/i2;
	    	String r=Integer.toString(res);
	    	//s+="="+r;
	    		s=r;
	    	jte.setText(s);
	    	
	    }
	});
    c.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			jte.setText("");
			
		}
	});
    
    p = new JPanel();
    p.add(j1);
    p.add(j2);
    p.add(j3);
    p.add(ja);
    p.add(j4);
    p.add(j5);
    p.add(j6);
    p.add(js);
    p.add(j7);
    p.add(j8);
    p.add(j9);
    p.add(jm);
    p.add(j0);
    p.add(jd);

    p.add(je);
    p.add(c);
	
    
    
    
    //f.setLayout(new GridLayout(5, 3));
    f.add(p);
    f.setSize(200, 200);

    mf.pack();
	
	}
	
	public static void main(String[] args) {
		new MFrames();
	}
}
