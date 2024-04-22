
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class Main extends Application {

     private TextField degreeTextField,data_tf,unknown_tf,dataUnkown_tf,dataValues,getXFX;
    
     private Label appInfo,enterValue,newtonXFX,  aboutLabel,titleLabel,methodNameLabel,error,solutionLabel,methodInfo,indata,ansLabel,ansLabel2,ansLabel3,getDegree,indata2,prasad,abhijeet,description,aboutC2W;
     private AnchorPane leftAnchorPane;
     private AnchorPane centerAnchorPane;
     private AnchorPane rightAnchorPane;
     private Button temp,submit,homeButton,bisection,nr,regulaFalsi,secant,gaussSeidal,gaussJacobis,lagranges,newtons,trapezoid,simpson1, simpson2,add,add2,add3,calculate,gaussCalculate,ourTeamButton,aboutApp,newtonsCalculate;
    private ImageView c2wLogo;
    int coeffCount=0;
    int degree= 0;
    double tempCoeffArr[]= new double[11];
    int index = 0;
    

    
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Engineering  Mathematics III ");
      
        AnchorPane root = new AnchorPane();
        root.setPrefHeight(800.0);
        root.setPrefWidth(1280);
        root.setStyle("-fx-border-style: solid; -fx-background-color: #FFFF; -fx-border-width: 10; -fx-border-color: ;");
        

        // Engineering Mathematics III
        titleLabel = new Label("                                             Engineering Mathematics III");
        titleLabel.setPrefHeight(75.0);
        titleLabel.setPrefWidth(1210.0);
        titleLabel.setStyle("-fx-background-color: #00008B;-fx-font-weight:bold;");
        titleLabel.setTextFill(Color.web("#f2e5e5"));
        titleLabel.setFont(Font.font("Calibri Bold", 48.0));
        AnchorPane.setLeftAnchor(titleLabel, 45.0);
        AnchorPane.setRightAnchor(titleLabel, 45.0);
        AnchorPane.setTopAnchor(titleLabel, 35.0);


        // Method name pane
        leftAnchorPane = new AnchorPane();
        leftAnchorPane.setPrefHeight(600.0);
        leftAnchorPane.setPrefWidth(515.0);
        leftAnchorPane.setStyle("-fx-background-color: #4EE2EC;");
        AnchorPane.setBottomAnchor(leftAnchorPane, 25.0);
        AnchorPane.setLeftAnchor(leftAnchorPane, 50.0);
        AnchorPane.setTopAnchor(leftAnchorPane, 150.0);

         

         // method name label
        methodNameLabel = new Label("            METHOD NAME");
        methodNameLabel.setPrefHeight(300);
        methodNameLabel.setPrefWidth(400.0);
        methodNameLabel.setStyle("-fx-background-color: #00008B;-fx-font-weight:bold;");
        methodNameLabel.setTextFill(Color.WHITE);
        methodNameLabel.setFont(Font.font("Calibri Bold", 36.0));
        AnchorPane.setBottomAnchor(methodNameLabel, 730.0);
        AnchorPane.setLeftAnchor(methodNameLabel, 0.0);
        AnchorPane.setRightAnchor(methodNameLabel, 0.0);
        AnchorPane.setTopAnchor(methodNameLabel, 0.0);

         //**********************************************************************************************************************

        // solution pane
        centerAnchorPane = new AnchorPane();
        centerAnchorPane.setPrefHeight(600.0);
        centerAnchorPane.setPrefWidth(470.0);
        centerAnchorPane.setStyle("-fx-border-width:2.0; -fx-border-style: solid;");
        AnchorPane.setBottomAnchor(centerAnchorPane, 25.0);
        AnchorPane.setLeftAnchor(centerAnchorPane, 610.0);
        AnchorPane.setRightAnchor(centerAnchorPane, 610.0);
        AnchorPane.setTopAnchor(centerAnchorPane, 150.0);

         //**********************************************************************************************************************

         //solution label
        solutionLabel = new Label("                         SOLUTION");
        solutionLabel.setPrefHeight(300.0);
        solutionLabel.setPrefWidth(370.0);
        solutionLabel.setStyle("-fx-background-color: #00008B;-fx-font-weight:bold");
        solutionLabel.setTextFill(Color.WHITE);
        solutionLabel.setFont(Font.font("Calibri B", 36.0));
        AnchorPane.setBottomAnchor(solutionLabel, 730.0);
        AnchorPane.setLeftAnchor(solutionLabel, 0.0);
        AnchorPane.setRightAnchor(solutionLabel, 0.0);
        AnchorPane.setTopAnchor(solutionLabel, 0.0);

         //**********************************************************************************************************************

        // about pane
        rightAnchorPane = new AnchorPane();
        rightAnchorPane.setPrefHeight(600.0);
        rightAnchorPane.setPrefWidth(515.0);
        rightAnchorPane.setStyle("-fx-background-color: #4EE2EC;");
        AnchorPane.setBottomAnchor(rightAnchorPane, 25.0);
        AnchorPane.setRightAnchor(rightAnchorPane, 50.0);
        AnchorPane.setTopAnchor(rightAnchorPane, 150.0);

        aboutLabel = new Label("                    ABOUT");
        aboutLabel.setStyle("-fx-background-color: #00008B;-fx-font-weight:bold;");
        aboutLabel.setTextFill(Color.WHITE);
        aboutLabel.setFont(Font.font("Calibri Bold", 36.0));
        AnchorPane.setBottomAnchor(aboutLabel, 730.0);
        AnchorPane.setLeftAnchor(aboutLabel, 0.0);
        AnchorPane.setRightAnchor(aboutLabel, 0.0);
        AnchorPane.setTopAnchor(aboutLabel, 0.0);

         //**********************************************************************************************************************
        description = new Label("");
        description.setPrefHeight(100.0);
        description.setPrefWidth(150.0);
        //description.setStyle("-fx-background-color: #FFFF;");
        //description.setStyle("-fx-font-weight:bold");
        description.setFont(Font.font("Calibri bold", 30.0));
        description.setTextFill(Color.BLACK);
        AnchorPane.setBottomAnchor(description, 650.0);
        AnchorPane.setLeftAnchor(description, 50.0);
        AnchorPane.setRightAnchor(description, 50.0);
        AnchorPane.setTopAnchor(description, 100.0);

         //**********************************************************************************************************************
      
        // method info

        methodInfo = new Label("");
        methodInfo.setPrefHeight(700.0);
        methodInfo.setPrefWidth(200.0);    
        methodInfo.setFont(Font.font("Calibri bold", 20.0));
        methodInfo.setTextFill(Color.BLACK);
        AnchorPane.setLeftAnchor(methodInfo, 46.0);
        AnchorPane.setRightAnchor(methodInfo, 46.0);
        AnchorPane.setTopAnchor(methodInfo, 50.0);

        //**********************************************************************************************************************

        ourTeamButton = new Button("ABOUT Core2web");
        ourTeamButton.setPrefHeight(50.0);
        ourTeamButton.setPrefWidth(200.0);
        ourTeamButton.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(ourTeamButton, 100.0);
        AnchorPane.setRightAnchor(ourTeamButton, 100.0);
        AnchorPane.setTopAnchor(ourTeamButton, 695.0);

        ourTeamButton.setOnAction(even->{

                ourInfo(); 
        });

        aboutApp = new Button("ABOUT PROJECT");
        aboutApp.setPrefHeight(50.0);
        aboutApp.setPrefWidth(200.0);
        aboutApp.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(aboutApp, 100.0);
        AnchorPane.setRightAnchor(aboutApp, 100.0);
        AnchorPane.setTopAnchor(aboutApp, 695.0);

        aboutApp.setOnAction(even->{

                description.setText("  Description ->");
                rightAnchorPane.getChildren().clear();
                rightAnchorPane.getChildren().addAll(appInfo,description,ourTeamButton,aboutLabel);
        });
        //**********************************************************************************************************************


        c2wLogo = new ImageView("c2wLogo.png");
        c2wLogo.setFitWidth(310); 
        c2wLogo.setFitHeight(80); 
        AnchorPane.setBottomAnchor(c2wLogo, 0.0);
        AnchorPane.setLeftAnchor(c2wLogo, 55.0);
        AnchorPane.setRightAnchor(c2wLogo, 0.0);
        AnchorPane.setTopAnchor(c2wLogo,30.0);

                //**********************************************************************************************************************



        displayAppInfo(); // alredy open home page

        // home button
        homeButton = new Button("HOME");
        homeButton.setPrefHeight(50.0);
        homeButton.setPrefWidth(200.0);
        homeButton.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(homeButton, 80.0);
        AnchorPane.setRightAnchor(homeButton, 80.0);
        AnchorPane.setTopAnchor(homeButton, 110.0);

        homeButton.setOnAction(event -> {

             error.setText("");
             ansLabel.setText("");
             
            centerAnchorPane.getChildren().clear();
            rightAnchorPane.getChildren().clear();
            centerAnchorPane.getChildren().addAll(solutionLabel,error); 
            rightAnchorPane.getChildren().addAll(aboutLabel); 
  
            displayAppInfo();
        });
           
        //**********************************************************************************************************************

        // bisection
        bisection = new Button("BISECTION");
        bisection.setPrefHeight(50.0);
        bisection.setPrefWidth(200.0);
        bisection.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(bisection, 80.0);
        AnchorPane.setRightAnchor(bisection, 80.0);
        AnchorPane.setTopAnchor(bisection, 180.0);

        bisection.setOnAction(event -> {

            index=0;
            error.setText("");
            ansLabel.setText("");
            submit.setDisable(false);
            temp = bisection;
                                    
            methodInfo.setText("\nFounder Name => G.E. Collins and A.G. Akritas \n\nStep1: Find points a and b such that a<b and \n           f(a)⋅f(b)<0. \n\nStep2: Take the interval [a,b] and find\n           x0=(a+b)/2\n\nStep3: If f(x0)=0 then x0 is an exact root\n            else if f(a)⋅f(x0)<0 then b=x0,\n            else if f(x0)⋅f(b)<0 then a=x0.\n\nStep4: Repeat steps 2 & 3 until f(xi)=0 or \n           |f(xi)|≤Accuracy\n\nExample =>2x^3-2x-5=0 \n                    x=1.6006 \n");

            rightAnchorPane.getChildren().clear();
            rightAnchorPane.getChildren().addAll(aboutLabel,methodInfo);
            centerAnchorPane.getChildren().clear();
            centerAnchorPane.getChildren().addAll(solutionLabel,error); 

            getUserInputForDegree();
        });

        // NR
        nr = new Button("NEWTONS RAPHSON");
        nr.setPrefHeight(50.0);
        nr.setPrefWidth(200.0);
        nr.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(nr, 80.0);
        AnchorPane.setRightAnchor(nr, 80.0);
        AnchorPane.setTopAnchor(nr, 231.0);

          nr.setOnAction(event -> {

            index=0;
            error.setText(""); 
            ansLabel.setText("");
            submit.setDisable(false);

            temp = nr;
            methodInfo.setText("\n\nFounder Name => Isaac Newton and \n                               Joseph Raphson\n\nStep1: Find points a and b such that a<b and\n           f(a)⋅f(b)<0. \n\nStep2: Take the interval [a,b] and find\n           x0=(a+b)/2\n\nStep3: Find f(x0) and f'(x0) x1=x0-f(x0)/f'(x0)\n\nStep4: If f(x1)=0 then x1 is an exact root,\n           else x0=x1\n\nStep5: Repeat steps 3 and 4 until f(xi)=0 or \n           |f(xi)|≤Accuracy\n\nExample => x^3-x-1=0 \n                    x=1.32471 \n");

            rightAnchorPane.getChildren().clear();
            rightAnchorPane.getChildren().addAll(aboutLabel,methodInfo);
            centerAnchorPane.getChildren().clear();
            centerAnchorPane.getChildren().addAll(solutionLabel,error); 

            getUserInputForDegree();
           
        });

        // regulaFalsi
        regulaFalsi = new Button("REGULA FALSI");
        regulaFalsi.setPrefHeight(50.0);
        regulaFalsi.setPrefWidth(200.0);
        regulaFalsi.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(regulaFalsi, 80.0);
        AnchorPane.setRightAnchor(regulaFalsi, 80.0);
        AnchorPane.setTopAnchor(regulaFalsi, 282.0);

        regulaFalsi.setOnAction(event -> {
            
            temp = regulaFalsi;
            index=0;
            error.setText("");
            ansLabel.setText("");
            submit.setDisable(false);

            methodInfo.setText("Founder Name => Qusta ibn Luqa \n\nStep1: Find points a and b such that a<b and \n           f(a)⋅f(b)<0. \n\nStep2: Take the interval [x0,x1] and\n            x2=x0-[f(x0)⋅x1-x0 f(x1)-f(x0)]\n\nStep3: If f(x0)=0 then x0 is an exact root\n            else if f(x0)⋅f(x2)<0 then x1=x2,\n            else if f(x2)⋅f(x1)<0 then x0=x2.\n\nStep4: Repeat steps 2 & 3 until f(xi)=0 or \n           |f(xi)|≤Accuracy\n\nExample => x^3+2x^2+x-1=0 \n                    x=0.4655 \n");

            rightAnchorPane.getChildren().clear();
            rightAnchorPane.getChildren().addAll(aboutLabel,methodInfo);
            centerAnchorPane.getChildren().clear();
            centerAnchorPane.getChildren().addAll(solutionLabel,error); 

            getUserInputForDegree();

        });


        // secant
        secant = new Button("SECANT");
        secant.setPrefHeight(50.0);
        secant.setPrefWidth(200.0);
        secant.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(secant, 80.0);
        AnchorPane.setRightAnchor(secant, 80.0);
        AnchorPane.setTopAnchor(secant, 333.0);
    

        secant.setOnAction(event -> {

            temp = secant;
            index=0;
            error.setText("");
            ansLabel.setText("");
            submit.setDisable(false);
            methodInfo.setText("Founder Name => Georg Rheticus \n\nStep1: Find points a and b such that a<b and \n           f(a)⋅f(b)<0. \n\nStep2: Take the interval [a,b] and find\n           x0=(a+b)/2\n\nStep3: If f(x0)=0 then x0 is an exact root\n              else x0=x1 and x1=x2.\n\nStep4: Repeat steps 2 & 3 until f(xi)=0 or \n           |f(xi)|≤Accuracy\n\nExample => x^3-x-1=0 \n                    x=1.32471\n\n ");
            rightAnchorPane.getChildren().clear();
            rightAnchorPane.getChildren().addAll(aboutLabel,methodInfo);
            centerAnchorPane.getChildren().clear();
            centerAnchorPane.getChildren().addAll(solutionLabel,error); 

            getUserInputForDegree();
            
        });

        // gaussSeidal
        gaussSeidal= new Button("GAUSS SEIDAL");
        gaussSeidal.setPrefHeight(50.0);
        gaussSeidal.setPrefWidth(200.0);
        gaussSeidal.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(gaussSeidal, 80.0);
        AnchorPane.setRightAnchor(gaussSeidal, 80.0);
        AnchorPane.setTopAnchor(gaussSeidal, 384.0);

        gaussSeidal.setOnAction(event -> {

            temp = gaussSeidal;
            index=0;
            gaussCount=0;
            gaussCount=0;
            gaussI = 0;
            error.setText("");
            ansLabel.setText("");
            submit.setDisable(false);
            methodInfo.setText("\n\nFounder Name => Carl Friedrich Gauss \n                               and Philipp L.Seidel \n\nExmaple : 45x1 + 2x2 + 3x3 =58\n                -3x1 + 22x2 + 2x3 = 47 \n                5x1 + x2+ 20x3 = 67\n\nFirst,check for the convergence of approximations,\n    45 > 2 + 3       22 > -3 + 2      20 > 5 + 1   \n\nInitial approximation, x1(0) = 0, x2(0) = 0 \n and x3(0)=0\n\nFirst Iteration:\nx1(1) = 1/45[ 58– 2 × 0 – 3 × 0 ] = 1.28889\nx2(1) = 1/22[47 +3 × 1.28889 – 2 × 0 ] = 2.31212\nx3(1) = 1/20[67 – 5 × 1.28889 – 1 × 2.31212] = 2.91217\n\nAfter 5 iterations\nx1 =1.0,\nx2 = 2.0,     x3 =3.0.");
            rightAnchorPane.getChildren().clear();
            rightAnchorPane.getChildren().addAll(aboutLabel,methodInfo);
            centerAnchorPane.getChildren().clear();
            centerAnchorPane.getChildren().addAll(solutionLabel,error); 

            guassInput();
            
        });

        // gaussJacobis
        gaussJacobis = new Button("GAUSS JACOBIS");
        gaussJacobis.setPrefHeight(50.0);
        gaussJacobis.setPrefWidth(200.0);
        gaussJacobis.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(gaussJacobis, 80.0);
        AnchorPane.setRightAnchor(gaussJacobis, 80.0);
        AnchorPane.setTopAnchor(gaussJacobis, 435.0);

        gaussJacobis.setOnAction(event -> {

            temp = gaussJacobis;
            index=0;
            gaussCount=0;
            gaussI = 0;
            error.setText("");
            ansLabel.setText("");
            submit.setDisable(false);
            methodInfo.setText("\n\nFounder Name => Carl Gustav Jacob Jacobi \n\nExmaple : 26x1 + 2x2 + 2x3 = 12.6\n                3x1 + 27x2 + x3 = – 14.3 \n                2x1 + 3x2 + 17x3 = 6.0\n\nFirst,check for the convergence of approximations,\n    26 > 2 + 2       27 > 3 + 1      17 > 2 + 3   \n\nInitial approximation, x1(0) = 0, x2(0) = 0 \n and x3(0)=0\n\nFirst Iteration:\nx1(1) = 1/26[12.6 – 2 × 0 – 2 × 0 ] = 0.48462\nx2(1) = 1/27[ – 14.3 – 3 × 0 – 1 × 0 ] = –0.52963\nx3(1) = 1/17[6 – 2 × 0 – 3 × 0] = 0.35294\n\nAfter 5 iterations\nx1 =0.5,\nx2 = –0.6,\nx3 =0.4.");
            rightAnchorPane.getChildren().clear();
            rightAnchorPane.getChildren().addAll(aboutLabel,methodInfo);
            centerAnchorPane.getChildren().clear();
            centerAnchorPane.getChildren().addAll(solutionLabel,error); 
            
             guassInput();

        });
        
         // lagranges
        lagranges = new Button("LAGRANGES INTERPOLATION");
        lagranges.setPrefHeight(50.0);
        lagranges.setPrefWidth(200.0);
        lagranges.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(lagranges, 80.0);
        AnchorPane.setRightAnchor(lagranges, 80.0);
        AnchorPane.setTopAnchor(lagranges, 486.0);

        lagranges.setOnAction(event -> {

            temp = lagranges;
             index=0;
            //methodInfo.setText("Founder Name => Joseph-Louis Lagrange \n\n\nFormula : y(x)= y0.{[(x-x1)(x-x2)....(x-xn)]/\n                         (x0-x1)(x0-x2)...(x0-xn)}      \n\n  \n           Xo=(a+b)/2\n\nStep3: If f(Xo)=0 then Xo is an exact root\n            else if f(a)⋅f(Xo)<0 then b=Xo,\n            else if f(Xo)⋅f(b)<0 then a=Xo.\n\nStep4: Repeat steps 2 & 3 until f(xi)=0 or \n           |f(xi)|≤Accuracy\n\nExample => X^3-X-1=0 \n                    X=1.32471 ");
             error.setText("");
             ansLabel.setText("");
             submit.setDisable(false);
            methodInfo.setText("\nFounder Name => Joseph-Louis Lagrange \n\nGiven,\n\n x     :   300      304      305      307\n f(x)  :   2.477   2.482   2.484   2.487 \n\nFirst order Lagrange Interpolation Formula is,\n\ny={(x-x1)/(x0-x1)}y0+{(x-x0)(x1-x0)}y1\n\nAt x=301\n\n\n\nThe value of f(x) at x = 301 is 2.4772\n");

            rightAnchorPane.getChildren().clear();
            rightAnchorPane.getChildren().addAll(aboutLabel,methodInfo);
            centerAnchorPane.getChildren().clear();
            centerAnchorPane.getChildren().addAll(solutionLabel,error); 
            lagIndex=0;
            lagIndex1=0;           
            newtonsInput();


  
        });
        
         // newtons
        newtons = new Button("NEWTONS FOR-BACKWARD");
        newtons.setPrefHeight(50.0);
        newtons.setPrefWidth(200.0);
        newtons.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(newtons, 80.0);
        AnchorPane.setRightAnchor(newtons, 80.0);
        AnchorPane.setTopAnchor(newtons, 537.0);

        newtons.setOnAction(event -> {

            temp = newtons;
            index=0;
            error.setText("");
            ansLabel.setText("");
            submit.setDisable(false);
            methodInfo.setText("Founder Name => Isaac Newton\n\nFormulas\n\nNewtons Forward : p=(x-x0)/h\n                               y(x)=y0+pΔy0+\n                               p(p-1)/2!.Δ2y0+\n                               p(p-1)(p-2)/3!.Δ3y0+\n                               p(p-1)(p-2)(p-3)/4!.Δ4y0+...\n\nNewtons Backward : p=(x-xn)/h\n                                 y(x)=yn+p∇yn+\n                                 p(p+1)/2!.∇2yn+\n                                 p(p+1)(p+2)/3!.∇3yn+\n                                 p(p+1)(p+2)(p+3)/4!.∇+...\n\n\n\n");
            rightAnchorPane.getChildren().clear();
            rightAnchorPane.getChildren().addAll(aboutLabel,methodInfo);
            centerAnchorPane.getChildren().clear();
            centerAnchorPane.getChildren().addAll(solutionLabel,error); 
            lagIndex=0;
            lagIndex1=0;
            newtonsInput();
    
        });
        
        // trapezoid
        trapezoid = new Button("TRAPEZOID");
        trapezoid.setPrefHeight(50.0);
        trapezoid.setPrefWidth(200.0);
        trapezoid.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(trapezoid, 80.0);
        AnchorPane.setRightAnchor(trapezoid, 80.0);
        AnchorPane.setTopAnchor(trapezoid, 588.0);

        trapezoid.setOnAction(event -> {

            temp = trapezoid;
            index=0;
            error.setText("");
            ansLabel.setText("");
            submit.setDisable(false);
            methodInfo.setText("Founder Name => Martin Brodeur \n\nTrapezoid Rule : \n\n∫ydx=h/2(y0+2(y1+y2+y3+...+yn-1)+yn)\n\nExample : \n\nx\t1.4        1.6        1.8        2        2.2\ny\t4.0552  4.953  6.0436  7.3891  9.025\n\n∫ydx=0.2/2[4.055+9.02+2(4.95+6.043+7.38)]\n∫ydx=4.9852\n\nSolution by Trapezoidal Rule is 4.9852");
            rightAnchorPane.getChildren().clear();
            rightAnchorPane.getChildren().addAll(aboutLabel,methodInfo);
            centerAnchorPane.getChildren().clear();
            centerAnchorPane.getChildren().addAll(solutionLabel,error); 
            lagIndex=0;
            lagIndex1=0;
             newtonsInput();
            
        });

        // simpson1
        simpson1 = new Button("SIMPSONS 1/3");
        simpson1.setPrefHeight(50.0);
        simpson1.setPrefWidth(200.0);
        simpson1.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(simpson1, 80.0);
        AnchorPane.setRightAnchor(simpson1, 80.0);
        AnchorPane.setTopAnchor(simpson1, 639.0);

        simpson1.setOnAction(event -> {

            temp =simpson1;
            index=0;
            error.setText("");
            ansLabel.setText("");
            submit.setDisable(false);
            methodInfo.setText("Founder Name => Thomas Simpson FRS  \n\nSimphosons 1/3 Rule : \n\n∫ydx = h/3(y0+4(y1+y3+y5+...++yn-1)+\n            2(y2+y4+y6+...+yn-2)+yn)\n\nExample : \n\nx\t1.4        1.6        1.8        2        2.2\ny\t4.0552  4.953  6.0436  7.3891  9.025\n\n∫ydx=0.2/3[(4.05+9.02)+4(4.95+7.38)+2(6.04)]\n∫ydx=4.9691\n\nSolution by Simpson's 1/3 Rule is 4.9691");
            rightAnchorPane.getChildren().clear();
            rightAnchorPane.getChildren().addAll(aboutLabel,methodInfo);
            centerAnchorPane.getChildren().clear();
            centerAnchorPane.getChildren().addAll(solutionLabel,error); 
            lagIndex=0;
            lagIndex1=0;
             newtonsInput();
  
        });

        // simpson2
        simpson2 = new Button("SIMPSONS 3/8");
        simpson2.setPrefHeight(50.0);
        simpson2.setPrefWidth(200.0);
        simpson2.setFont(Font.font("Calibri bold", 18.0));
        AnchorPane.setLeftAnchor(simpson2, 80.0);
        AnchorPane.setRightAnchor(simpson2, 80.0);
        AnchorPane.setTopAnchor(simpson2, 690.0);

        simpson2.setOnAction(event -> {

            temp = simpson2;
            index=0;
            error.setText("");
            ansLabel.setText("");
            submit.setDisable(false);
            methodInfo.setText("Founder Name => Thomas Simpson FRS  \n\nSimphosons 1/3 Rule : \n\n∫ydx = 3h/8(y0+2(y3+y6+...+yn-3)+\n            3(y1+y2+y4+y5+...+yn-2+yn-1)+yn)\n\nExample : \n\nx\t1.4        1.6        1.8        2        2.2\ny\t4.0552  4.953  6.0436  7.3891  9.025\n\n∫ydx=3*0.2/8[(4.05+9.02)+2(7.38)+3(4.95+6.0)]\n∫ydx=4.5636\n\nSolution by Simpson's 3/8 Rule is 4.5636");
            rightAnchorPane.getChildren().clear();
            rightAnchorPane.getChildren().addAll(aboutLabel,methodInfo);
            centerAnchorPane.getChildren().clear();
            centerAnchorPane.getChildren().addAll(solutionLabel,error); 
            lagIndex=0;
            lagIndex1=0;
             newtonsInput();
            
        });
        
         //**********************************************************************************************************************

        //error label
        error=new Label("");
        error.setTextFill(Color.RED);
        error.setFont(Font.font("Calibri Bold", 20.0));
        AnchorPane.setBottomAnchor(error, 100.0);
        AnchorPane.setLeftAnchor(error, 50.0);
        AnchorPane.setRightAnchor(error, 50.0);
        AnchorPane.setTopAnchor(error,650.0);

         //**********************************************************************************************************************
         
         ansLabel = new Label("");
         ansLabel.setTextFill(Color.BLACK);
        ansLabel.setFont(Font.font("Calibri Bold", 20.0));
         ansLabel.setStyle("-fx-border-width:1.0; -fx-border-style: solid;");
        AnchorPane.setBottomAnchor(ansLabel, 190.0);
        AnchorPane.setLeftAnchor(ansLabel, 150.0);
        AnchorPane.setRightAnchor(ansLabel, 150.0);
        AnchorPane.setTopAnchor(ansLabel,560.0);

           //**********************************************************************************************************************
            // submit button
        submit = new Button("SUBMIT");
        submit.setPrefHeight(50.0);
        submit.setPrefWidth(200.0);
        submit.setFont(Font.font("Calibri bold", 21.0));
        submit.setStyle("-fx-background-color: ##FFFF;");
        AnchorPane.setLeftAnchor( submit, 400.0);
        AnchorPane.setRightAnchor( submit, 130.0);
        AnchorPane.setTopAnchor (submit, 160.0);
        AnchorPane.setBottomAnchor (submit, 580.0);

         submit.setOnAction(event -> {
                                    
                                coeffCount = 0;
                                index = 0;
                               if(temp == bisection || temp == secant || temp == nr || temp == regulaFalsi){

                                    numericalSubmit();

                               }
                               else if (temp == gaussSeidal || temp == gaussJacobis ){

                                    gaussSubmit();

                               }
                               else if(temp == newtons || temp == lagranges){

                                    newtonsSubmit();

                               }

           
        });
        //**********************************************************************************************************************
        

        // screen
        root.getChildren().addAll(titleLabel, leftAnchorPane, centerAnchorPane, rightAnchorPane,c2wLogo);
        leftAnchorPane.getChildren().addAll(methodNameLabel, homeButton, bisection,nr,regulaFalsi,secant,gaussSeidal,gaussJacobis,lagranges,newtons,trapezoid,simpson1,simpson2); // Add more buttons similarly...

        centerAnchorPane.getChildren().addAll(solutionLabel); 
        rightAnchorPane.getChildren().add(aboutLabel);

        Scene scene = new Scene(root, 1920, 990);
        primaryStage.setResizable(false);
        //Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    static  double polyResultCalculation(double x,int index, double arr[])

    {
        double polyResult = 0;

        int k = 0;

                    for(int i=0;i<index;i++){
                            double team = 1;
                            for(int j=i;j<index;j++){
                                    team = team*x;
             }
                            team = team * arr[k];
            k++;

                            polyResult = polyResult +team;
                    }
                    polyResult = polyResult + arr[index];

    return polyResult;
}

     
    // home page information
    private void displayAppInfo() {
        
        description.setText("  Description ->");

        appInfo = new Label("      The Engineering Mathematics 3 Numerical \nMethods Toolkit is a JavaFX application desig-\nned to provide a comprehensive set of numeri-\ncal methods  and  tools for solving  complex \nengineering mathematical problems. \n\nThis project aims to empower engineering \nstudents and professionals with user-friendly\ninterface to perform numerical computations\nefficiently.");
        appInfo.setPrefHeight(300.0);
        appInfo.setPrefWidth(200.0);    
        appInfo.setFont(Font.font("Calibri bold", 20.0));
        appInfo.setTextFill(Color.BLACK);
        //AnchorPane.setBottomAnchor(appInfo, 0.0);
        AnchorPane.setLeftAnchor(appInfo, 46.0);
        AnchorPane.setRightAnchor(appInfo, 46.0);
        AnchorPane.setTopAnchor(appInfo, 210.0);

       

        Label ourTeam = new Label("Our Team");
        ourTeam.setPrefHeight(100.0);
        ourTeam.setPrefWidth(150.0);
        //description.setStyle("-fx-background-color: #FFFF;");
        //description.setStyle("-fx-border-width:1.0; -fx-border-style: solid;");
        ourTeam.setFont(Font.font("Calibri bold", 24.0));
        ourTeam.setTextFill(Color.BLACK);
        AnchorPane.setBottomAnchor(ourTeam, 0.0);
        AnchorPane.setLeftAnchor(ourTeam, 200.0);
        AnchorPane.setRightAnchor(ourTeam, 200.0);
        AnchorPane.setTopAnchor(ourTeam, 300.0);

 
        ImageView eng = new ImageView("engineer.jpg");
        eng.setFitWidth(620); 
        eng.setFitHeight(170); 
        AnchorPane.setBottomAnchor(eng, 0.0);
        AnchorPane.setLeftAnchor(eng, 25.0);
        AnchorPane.setRightAnchor(eng, 50.0);
        AnchorPane.setTopAnchor(eng,500.0);

        ImageView student = new ImageView("student2girl.jpg");
        student.setFitWidth(650); 
        student.setFitHeight(350); 
        AnchorPane.setBottomAnchor(student, 0.0);
        AnchorPane.setLeftAnchor(student, 25.0);
        AnchorPane.setRightAnchor(student, 75.0);
        AnchorPane.setTopAnchor(student,150.0);

        centerAnchorPane.getChildren().addAll(eng,student);
        rightAnchorPane.getChildren().addAll(appInfo,description,ourTeamButton);
           
    }

    private void ourInfo(){

        aboutC2W = new Label("        Dear Shashi Bagal sir and my wonderful \n Core2web Technology,I want to express my\n heartfelt gratitude for all the incredible\n coding lessons and guidance you've provided.\n You've made learning enjoyable and inspiring. \nThank you for your dedication and for \n being such fantastic teacher.");
        aboutC2W.setPrefHeight(300.0);
        aboutC2W.setPrefWidth(200.0);    
        aboutC2W.setFont(Font.font("Calibri bold", 20.0));
        aboutC2W.setTextFill(Color.BLACK);
        //AnchorPane.setBottomAnchor(appInfo, 0.0);
        AnchorPane.setLeftAnchor(aboutC2W, 46.0);
        AnchorPane.setRightAnchor(aboutC2W, 46.0);
        AnchorPane.setTopAnchor(aboutC2W, 350.0);

        //description.setText("  Our Team ->");
        rightAnchorPane.getChildren().clear();

        prasad = new Label("            Prasad Zadokar ");
        prasad.setPrefHeight(400.0);
        prasad.setPrefWidth(400.0);    
        
        prasad.setFont(Font.font("Calibri bold", 20.0));
        //prasad.setStyle(";-fx-font-weight:bold;");

        prasad.setTextFill(Color.BLACK);
        AnchorPane.setLeftAnchor(prasad, 0.0);
        AnchorPane.setRightAnchor(prasad, 300.0);
        AnchorPane.setTopAnchor(prasad, 450.0);



        abhijeet = new Label("                            Abhijeet Bhakare");
        abhijeet.setPrefHeight(400.0);
        abhijeet.setPrefWidth(300.0);    
        
        abhijeet.setFont(Font.font("Calibri bold", 20.0));
        //prasad.setStyle(";-fx-font-weight:bold;");

        abhijeet.setTextFill(Color.BLACK);
        AnchorPane.setLeftAnchor(abhijeet, 150.0);
        AnchorPane.setRightAnchor(abhijeet, 0.0);
        AnchorPane.setTopAnchor(abhijeet, 450.0);

        ImageView Homeback = new ImageView("Homeback.PNG");
        Homeback.setFitWidth(300); 
        Homeback.setFitHeight(270); 
        AnchorPane.setBottomAnchor(Homeback, 0.0);
        AnchorPane.setLeftAnchor(Homeback, 100.0);
        AnchorPane.setRightAnchor(Homeback, 0.0);
        AnchorPane.setTopAnchor(Homeback,100.0);

        rightAnchorPane.getChildren().addAll(aboutLabel,prasad,abhijeet,Homeback,aboutApp,aboutC2W);

    }

    private void getUserInputForDegree() {
    
        coeffCount =0;
        getDegree = new Label("                    Enter degree of equation");
        getDegree.setPrefHeight(100.0);
        getDegree.setPrefWidth(150.0);
        getDegree.setStyle("-fx-background-color: #FFFF;");
        // getDegree.setStyle("-fx-border-width:1.0; -fx-border-style: solid;");
        getDegree.setFont(Font.font("Calibri bold", 21.0));
        getDegree.setTextFill(Color.BLACK);
        AnchorPane.setBottomAnchor(getDegree, 650.0);
        AnchorPane.setLeftAnchor(getDegree, 100.0);
        AnchorPane.setRightAnchor(getDegree, 100.0);
        AnchorPane.setTopAnchor(getDegree, 100.0);

    
        
        //degree input
        degreeTextField = new TextField();
        degreeTextField.setPrefHeight(100.0);
        degreeTextField.setPrefWidth(150.0);
        //degreeTextField.setStyle("-fx-background-color: ;");
        degreeTextField.setFont(Font.font("Calibri Bold", 20.0));
        AnchorPane.setBottomAnchor(degreeTextField, 580.0);
        AnchorPane.setLeftAnchor(degreeTextField, 120.0);
        AnchorPane.setRightAnchor(degreeTextField, 420.0);
        AnchorPane.setTopAnchor(degreeTextField, 160.0);


        centerAnchorPane.getChildren().addAll(getDegree,degreeTextField,submit); 
         

    }

    private void guassInput() {
    
        Label getUnknown = new Label("       Enter the number of unknowns(less than 5)");
        getUnknown.setPrefHeight(100.0);
        getUnknown.setPrefWidth(150.0);
        getUnknown.setStyle("-fx-background-color: #FFFF;");
        //getUnknown.setStyle("-fx-border-width:1.0; -fx-border-style: solid;");
        getUnknown.setFont(Font.font("Calibri bold", 21.0));
        getUnknown.setTextFill(Color.BLACK);
        AnchorPane.setBottomAnchor(getUnknown, 650.0);
        AnchorPane.setLeftAnchor(getUnknown, 100.0);
        AnchorPane.setRightAnchor(getUnknown, 100.0);
        AnchorPane.setTopAnchor(getUnknown, 100.0);


        // degree input
        unknown_tf = new TextField();
        unknown_tf.setPrefHeight(100.0);
        unknown_tf.setPrefWidth(150.0);
       // degreeTextField.setStyle("-fx-background-color: ;");
        unknown_tf.setFont(Font.font("Calibri Bold", 20.0));
        AnchorPane.setBottomAnchor(unknown_tf, 580.0);
        AnchorPane.setLeftAnchor(unknown_tf, 120.0);
        AnchorPane.setRightAnchor(unknown_tf, 420.0);
        AnchorPane.setTopAnchor(unknown_tf, 160.0);

       
         centerAnchorPane.getChildren().addAll(getUnknown,unknown_tf,submit); 
         
  
}



private void numericalSubmit(){

        


		int clip=0;

            try {
                error.setText(""); 
                 // Clear error message
                degree = Integer.parseInt(degreeTextField.getText());

                if(degree > 10){
                    clip = 1;
                    error.setText("                    Invalid Input Please Enter a Valid Integer...");
                }
        
                if (degree >= 0) {
                     // Valid input, exit the loop
                } else {
                    error.setText("            Invalid Input Please Enter a Non-Negative Integer...");
                    clip = 1; 
                    degreeTextField.clear();
                }
            } catch (NumberFormatException e) {
                error.setText("                    Invalid Input Please Enter a Valid Integer...");
                degreeTextField.clear();
                clip = 1;
            }

        
        if(clip ==0){

                degreeTextField.setDisable(!degreeTextField.isDisabled());
                submit.setDisable(true);
                        
                indata = new Label("   Enter Coefficients of equation from high to low");
                indata.setStyle("-fx-background-color: ;");
                indata.setTextFill(Color.BLACK);
                indata.setFont(Font.font("Calibri Bold", 21.0));
                AnchorPane.setBottomAnchor(indata, 500.0);
                AnchorPane.setLeftAnchor(indata, 100.0);
                AnchorPane.setRightAnchor(indata, 100.0);
                AnchorPane.setTopAnchor(indata,250.0);


                data_tf = new TextField();
                data_tf.setPrefHeight(30.0);
                data_tf.setPrefWidth(80.0);
                data_tf.setFont(Font.font("Calibri Bold", 20.0));
                AnchorPane.setBottomAnchor(data_tf, 430.0);
                AnchorPane.setLeftAnchor(data_tf, 120.0);
                AnchorPane.setRightAnchor(data_tf, 420.0);
                AnchorPane.setTopAnchor(data_tf, 310.0);

                add = new Button("ADD");
                add.setPrefHeight(50.0);
                add.setPrefWidth(200.0);
                add.setFont(Font.font("Calibri bold", 21.0));
                add.setStyle("-fx-background-color: ##FFFF;");
                AnchorPane.setLeftAnchor( add, 400.0);
                AnchorPane.setRightAnchor( add, 130.0);
                AnchorPane.setTopAnchor (add, 310.0);
                AnchorPane.setBottomAnchor (add, 430.0);
                
            
                    add.setOnAction(event -> {

                        getCoifficent();
                        data_tf.clear();
                         
                        
                           
                });
                
                
                calculate = new Button("CALCULATE");
                calculate.setPrefHeight(50.0);
                calculate.setPrefWidth(200.0);
                calculate.setFont(Font.font("Calibri bold", 21.0));
                AnchorPane.setLeftAnchor( calculate, 150.0);
                AnchorPane.setRightAnchor( calculate, 150.0);
                AnchorPane.setTopAnchor (calculate, 470.0);
                AnchorPane.setBottomAnchor (calculate, 270.0);

                


                centerAnchorPane.getChildren().addAll(data_tf,indata,add,calculate);

                calculate.setDisable(true);
                
                calculate.setOnAction(event -> {

                    Label  ansLabel = new Label("");
                    ansLabel.setTextFill(Color.BLACK);
                    ansLabel.setFont(Font.font("Calibri Bold", 20.0));
                    ansLabel.setStyle("-fx-border-width:1.0; -fx-border-style: solid;");
                    AnchorPane.setBottomAnchor(ansLabel, 190.0);
                    AnchorPane.setLeftAnchor(ansLabel, 150.0);
                    AnchorPane.setRightAnchor(ansLabel, 150.0);
                    AnchorPane.setTopAnchor(ansLabel,560.0);

                    
                    
                    centerAnchorPane.getChildren().addAll(ansLabel);

                if(coeffCount == degree+1){
                    
                            Interval();
                        }
                    
                    if(temp == bisection){
                        bisectionOnCalculate();     

                    }else if(temp == nr){

                        nrOnCalculate();

                    }
                    else if(temp == regulaFalsi){

                        regulaFalsiOnCalculate();

                    }
                    else if(temp == secant){

                        secantOnCalculate();

                    }
                });
    }

}


private void gaussSubmit(){

    
		    int clip=0;

            try {
                error.setText(""); 
                 // Clear error message
                degree = Integer.parseInt(unknown_tf.getText());
                

                if(degree > 4 || degree <=1){
                    clip = 1;
                    error.setText("                    Invalid Input Please Enter a Valid Integer...");
                }
        
                if (degree >= 0) {
                     // Valid input, exit the loop
                } else {
                    error.setText("            Invalid Input Please Enter a Non-Negative Integer...");
                    clip = 1; 
                    unknown_tf.clear();
                }
            } catch (NumberFormatException e) {
                error.setText("                    Invalid Input Please Enter a Valid Integer...");
                unknown_tf.clear();
                clip = 1;
            }


             if(clip ==0){

            submit.setDisable(true);
            unknown_tf.setDisable(!unknown_tf.isDisabled());

        indata2 = new Label("   Enter Coefficients of equation One from high to low");
        indata2.setStyle("-fx-background-color: ;");
        indata2.setTextFill(Color.BLACK);
        indata2.setFont(Font.font("Calibri Bold", 21.0));
        AnchorPane.setBottomAnchor(indata2, 500.0);
        AnchorPane.setLeftAnchor(indata2, 100.0);
        AnchorPane.setRightAnchor(indata2, 100.0);
        AnchorPane.setTopAnchor(indata2,250.0);

        dataUnkown_tf = new TextField();
        dataUnkown_tf.setPrefHeight(30.0);
        dataUnkown_tf.setPrefWidth(80.0);
        dataUnkown_tf.setFont(Font.font("Calibri Bold", 20.0));
        AnchorPane.setBottomAnchor(dataUnkown_tf, 430.0);
        AnchorPane.setLeftAnchor(dataUnkown_tf, 120.0);
        AnchorPane.setRightAnchor(dataUnkown_tf, 420.0);
        AnchorPane.setTopAnchor(dataUnkown_tf, 310.0);

        add2 = new Button("ADD");
        add2.setPrefHeight(50.0);
        add2.setPrefWidth(200.0);
        add2.setFont(Font.font("Calibri bold", 21.0));
        add2.setStyle("-fx-background-color: ##FFFF;");
        AnchorPane.setLeftAnchor( add2, 400.0);
        AnchorPane.setRightAnchor( add2, 130.0);
        AnchorPane.setTopAnchor (add2, 310.0);
        AnchorPane.setBottomAnchor (add2, 430.0);

        add2.setOnAction(event -> {

                        getUnknowns();
                        dataUnkown_tf.clear();
                         
        });

                gaussCalculate = new Button("CALCULATE");
                gaussCalculate.setPrefHeight(50.0);
                gaussCalculate.setPrefWidth(200.0);
                gaussCalculate.setFont(Font.font("Calibri bold", 21.0));
                AnchorPane.setLeftAnchor( gaussCalculate, 150.0);
                AnchorPane.setRightAnchor( gaussCalculate, 150.0);
                AnchorPane.setTopAnchor (gaussCalculate, 440.0);
                AnchorPane.setBottomAnchor (gaussCalculate, 300.0);

                gaussCalculate.setOnAction(even ->{

                    ansLabel2 = new Label("");
                    ansLabel2.setTextFill(Color.BLACK);
                    ansLabel2.setFont(Font.font("Calibri Bold", 20.0));
                    ansLabel2.setStyle("-fx-border-width:1.0; -fx-border-style: solid;");
                    AnchorPane.setBottomAnchor(ansLabel2, 190.0);
                    AnchorPane.setLeftAnchor(ansLabel2, 150.0);
                    AnchorPane.setRightAnchor(ansLabel2, 150.0);
                    AnchorPane.setTopAnchor(ansLabel2,560.0);

                    gaussOutput();

                });
       


                centerAnchorPane.getChildren().addAll(dataUnkown_tf,indata2,add2,gaussCalculate);
                gaussCalculate.setDisable(true);

    }


}


void  getCoifficent(){

    

            try {
                error.setText("");  // Clear error message
                tempCoeffArr[index] = Double.parseDouble(data_tf.getText());
                index++;
                coeffCount++;
                
                if(coeffCount == degree+1){

                data_tf.setDisable(!data_tf.isDisabled());
                add.setDisable(true);
                calculate.setDisable(false);



                    Label equation = new Label("");
                    equation.setTextFill(Color.BLACK);
                    equation.setFont(Font.font("Calibri Bold", 20.0));
                    equation.setStyle("-fx-border-width:1.0; -fx-border-style: solid;");
                    AnchorPane.setBottomAnchor(equation, 350.0);
                    AnchorPane.setLeftAnchor(equation, 150.0);
                    AnchorPane.setRightAnchor(equation, 150.0);
                    AnchorPane.setTopAnchor(equation,400.0);

                    String str1 = "";
                    char ch ='x';
                    int tempDegree = degree;
                    for(int i=0; i<coeffCount-1; i++){

                        str1 =str1+""+tempCoeffArr[i]+""+ch+"^"+tempDegree+" + ";
                        
                        tempDegree--;

                    }
                    str1 = str1 + tempCoeffArr[coeffCount-1] +" = 0";

                    

                    equation.setText(" "+str1);

                    centerAnchorPane.getChildren().addAll(equation);

    }
        
                
            } catch (NumberFormatException e) {
                error.setText("                     Invalid Input. Please Enter a Valid Integer.");
                data_tf.clear();
                
            }

}

int gaussCount=0;
int gaussI = 0;
double[] gaussArr1=new double[5];
double[] gaussArr2=new double[5];
double[] gaussArr3=new double[5];
double[] gaussArr4=new double[5];

private void getUnknowns(){
 
    if(gaussCount==0){

                try {
                            error.setText("");  // Clear error message
                            gaussArr1[gaussI] = Double.parseDouble(dataUnkown_tf.getText());
                        
                            gaussI++;
                            coeffCount++;
                            
                            if(coeffCount == degree+1){

                            indata2.setText("Enter Coefficients of equation Two from high to low");
                            gaussCount++;
                                if(gaussCount==degree){

                                    add2.setDisable(true);
                                    dataUnkown_tf.setDisable(true);
                                    gaussCalculate.setDisable(false);
                                }
                            coeffCount=0; 
                            gaussI = 0;
                            }
                    
                            
                } catch (NumberFormatException e) {
                            error.setText("                     Invalid Input. Please Enter a Valid Integer.");
                            dataUnkown_tf.clear();
                            
                }
    }
    else if(gaussCount==1){

        try {
                
                    error.setText("");  // Clear error message
                    gaussArr2[gaussI] = Double.parseDouble(dataUnkown_tf.getText());
                    gaussI++;
                    coeffCount++;     
                   
                    
                    if(coeffCount == degree+1){

                    indata2.setText("Enter Coefficients of equation Three from high to low");
                    gaussCount++;
                        if(gaussCount==degree){

                            add2.setDisable(true);
                            dataUnkown_tf.setDisable(true);
                            gaussCalculate.setDisable(false);
                        }
                    coeffCount=0; 
                    gaussI=0;  
                    }
                    
            
        } catch (NumberFormatException e) {
                    error.setText("                     Invalid Input. Please Enter a Valid Integer.");
                    dataUnkown_tf.clear();
                    
        }

}
    else if(gaussCount==2){

            try {
                        error.setText("");  // Clear error message
                        gaussArr3[gaussI] = Double.parseDouble(dataUnkown_tf.getText());
                        gaussI++;
                        coeffCount++;
                        
                        if(coeffCount == degree+1){

                        indata2.setText("Enter Coefficients of equation Four from high to low");
                        gaussCount++;
                        if(gaussCount==degree){

                                add2.setDisable(true);
                                dataUnkown_tf.setDisable(true);   
                                gaussCalculate.setDisable(false);
                        }
                        coeffCount=0; 
                        gaussI=0;  
                        }

                        
            } catch (NumberFormatException e) {
                        error.setText("                     Invalid Input. Please Enter a Valid Integer.");
                        dataUnkown_tf.clear();
                        
            }
    
    }
   else if(gaussCount==3){

        try {
                    error.setText("");  // Clear error message
                    gaussArr4[gaussI] = Double.parseDouble(dataUnkown_tf.getText());
                    gaussI++;
                    coeffCount++;
                    
                    if(coeffCount == degree+1){

                    gaussCount++;
                    if(gaussCount==degree){

                            add2.setDisable(true);
                            dataUnkown_tf.setDisable(true);
                            gaussCalculate.setDisable(false);
                        }
                    coeffCount=0; 
                    gaussI=0;  
                    }
                    
            
        } catch (NumberFormatException e) {
                    error.setText("                     Invalid Input. Please Enter a Valid Integer.");
                    dataUnkown_tf.clear();
                    
        }
    }
    
}



     
private void bisectionOnCalculate() {

        centerAnchorPane.getChildren().remove(ansLabel);

        double ans = Bisection();
        

         if(ans == 0.0){
            ansLabel.setText("  Solution Not Exit ");
            
        }
        else {
                        ansLabel.setText("  "+ans);

        }

        
        centerAnchorPane.getChildren().addAll(ansLabel);
}

double a=0;
double b=0;

void Interval(){

    a=0;
    b=0;

    int lowRange = -500;

    while(lowRange<500) {

        double first = polyResultCalculation(lowRange,degree,tempCoeffArr);
        double second = polyResultCalculation(lowRange+1,degree,tempCoeffArr);

        if(first<=0 && second>=0){
            a = lowRange;
            b = lowRange+1;
            break;

        }
        else if (second <=0 && first>=0){
            a = lowRange+1;
            b = lowRange;
            break;

        }
        lowRange++;
    }

}

double Bisection() {

    double c=0;

   for(int i=0; i<120; i++) {

        c = (a+b)/2;
       double temp =polyResultCalculation(c,degree,tempCoeffArr);

       if(temp<=0) {

           a=c;

       }else {

           b=c;

       }

   }

   return c;

}


double NR() {

    double arr1[]=new double[degree];

        for(int i=0; i<arr1.length; i++) {

            if(i==0){
                arr1[i]=tempCoeffArr[i+1];
            }else{
                arr1[i]=tempCoeffArr[i+1]*(i+1);

            }

        }

        double c= (a+b)/2;
        double temp=0;
        double x=0;
        double y=0;
        for(int i=0; i<4; i++) {


             x=polyResultCalculation(c,degree,tempCoeffArr);
             y=polyResultCalculation(c,degree,arr1);

             temp = (c - (x/y) );
             c=temp;



        }

        return c;


}

private void nrOnCalculate() {

    bisectionOnCalculate();
    
}

private void  regulaFalsiOnCalculate() {

    bisectionOnCalculate();
}

private void secantOnCalculate(){

    bisectionOnCalculate();    
}



void gaussOutput(){

    centerAnchorPane.getChildren().addAll(ansLabel2);
    double x=0;
    double y=0;
    double z=0;
    double w=0;
    int num = degree;

    for(int i=0; i<10; i++) {

        if(num==3){

            x=(1/gaussArr1[0])*(gaussArr1[num]-gaussArr1[1]*y-gaussArr1[2]*z);
            y=(1/gaussArr2[1])*(gaussArr2[num]-gaussArr2[0]*x-gaussArr2[2]*z);
            z=(1/gaussArr3[2])*(gaussArr3[num]-gaussArr3[0]*x-gaussArr3[1]*y);

        }else if(num==4){


            x=(1/gaussArr1[0])*(gaussArr1[num]-gaussArr1[1]*y-gaussArr1[2]*z-gaussArr1[3]*w);
            y=(1/gaussArr2[1])*(gaussArr2[num]-gaussArr2[0]*x-gaussArr2[2]*z-gaussArr2[3]*w);
            z=(1/gaussArr3[2])*(gaussArr3[num]-gaussArr3[0]*x-gaussArr3[1]*y-gaussArr3[3]*w);
            w=(1/gaussArr4[3])*(gaussArr4[num]-gaussArr4[0]*x-gaussArr4[1]*y-gaussArr4[2]*z);

        }else{


            x=(1/gaussArr1[0])*(gaussArr1[num]-gaussArr1[1]*y);
            y=(1/gaussArr2[1])*(gaussArr2[num]-gaussArr2[0]*x);

        }


    }


    float a = (float)x;
        float b = (float)y;
        float c = (float)z;
        float d = (float)w;


    if(num==3){

       ansLabel2.setText(""+a+"  ,  "+b+"  ,  "+c);

    }else if(num==4){

        ansLabel2.setText(""+a+"  ,  "+b+"  ,  "+c+"  ,  "+d);

    }else{

        ansLabel2.setText(""+a+"  ,  "+b);

    }



}

private void newtonsInput() {

           
              
        enterValue = new Label("                    Enter number of values");
        enterValue.setPrefHeight(100.0);
        enterValue.setPrefWidth(150.0);
        enterValue.setStyle("-fx-background-color: #FFFF;");
        enterValue.setFont(Font.font("Calibri bold", 21.0));
        enterValue.setTextFill(Color.BLACK);
        AnchorPane.setBottomAnchor(enterValue, 650.0);
        AnchorPane.setLeftAnchor(enterValue, 100.0);
        AnchorPane.setRightAnchor(enterValue, 100.0);
        AnchorPane.setTopAnchor(enterValue, 100.0);

        dataValues = new TextField();
        dataValues.setPrefHeight(100.0);
        dataValues.setPrefWidth(150.0);
        dataValues.setFont(Font.font("Calibri Bold", 20.0));
        AnchorPane.setBottomAnchor(dataValues, 580.0);
        AnchorPane.setLeftAnchor(dataValues, 120.0);
        AnchorPane.setRightAnchor(dataValues, 420.0);
        AnchorPane.setTopAnchor(dataValues, 160.0);

         centerAnchorPane.getChildren().addAll(enterValue,dataValues,submit); 


}
int dataNum = 0;
private void newtonsSubmit(){

    
		    int clip=0;

            try {
                error.setText(""); 
                 // Clear error message
                dataNum= Integer.parseInt(dataValues.getText());
                

                if(dataNum > 10 || dataNum < 1){
                    clip = 1;
                    error.setText("                    Invalid Input Please Enter a Valid Integer...");
                }
        
                if (dataNum >= 0) {
                     // Valid input, exit the loop
                } else {
                    error.setText("            Invalid Input Please Enter a Non-Negative Integer...");
                    clip = 1; 
                    dataValues.clear();
                }
            } catch (NumberFormatException e) {
                error.setText("                    Invalid Input Please Enter a Valid Integer...");
                dataValues.clear();
                clip = 1;
            }

            if (clip == 0){


                dataValues.setDisable(true);
                submit.setDisable(true);

                newtonXFX = new Label("                       Enter the values of x");
                newtonXFX.setStyle("-fx-background-color: ;");
                newtonXFX.setTextFill(Color.BLACK);
                newtonXFX.setFont(Font.font("Calibri Bold", 21.0));
                AnchorPane.setBottomAnchor(newtonXFX, 500.0);
                AnchorPane.setLeftAnchor(newtonXFX, 100.0);
                AnchorPane.setRightAnchor(newtonXFX, 100.0);
                AnchorPane.setTopAnchor(newtonXFX,250.0);

                
                add3 = new Button("ADD");
                add3.setPrefHeight(50.0);
                add3.setPrefWidth(200.0);
                add3.setFont(Font.font("Calibri bold", 21.0));
                add3.setStyle("-fx-background-color: ##FFFF;");
                AnchorPane.setLeftAnchor( add3, 400.0);
                AnchorPane.setRightAnchor( add3, 130.0);
                AnchorPane.setTopAnchor (add3, 310.0);
                AnchorPane.setBottomAnchor (add3, 430.0);

                getXFX = new TextField();
                        
                getXFX.setPrefHeight(30.0);
                getXFX.setPrefWidth(80.0);
                getXFX.setFont(Font.font("Calibri Bold", 20.0));
                AnchorPane.setBottomAnchor(getXFX, 430.0);
                AnchorPane.setLeftAnchor(getXFX, 120.0);
                AnchorPane.setRightAnchor(getXFX, 420.0);
                AnchorPane.setTopAnchor(getXFX, 310.0);

                add3.setOnAction(event -> {

                    getXFXvalues();
                    getXFX.clear();
                                        
                }); 
                centerAnchorPane.getChildren().addAll(getXFX,add3,newtonXFX);



            }

}
int x=1;
int lagIndex=0;
int lagIndex1=0;
 double[] lagrangesArr1=new double[10];
 double[] lagrangesArr2=new double[10];
 double data=0;
private void getXFXvalues(){
    try{

        error.setText("");
        if(x==1){
        
        lagrangesArr1[lagIndex]= Double.parseDouble(getXFX.getText());
                    //lagIndex++;

            if(lagIndex==dataNum-1){
                        x=2;
                        newtonXFX.setText("                       Enter the values of f(x)");
                        lagIndex=0;
            }
        
            lagIndex++;
        }else if(x==2){
        
       // newtonXFX.setText("                       Enter the values of y");
        lagrangesArr2[lagIndex1]= Double.parseDouble(getXFX.getText());
       

            if(lagIndex1==dataNum-1){
                 x=3;
                newtonXFX.setText("Enter the value for which function need calculate");
                 lagIndex=0;
            }

            lagIndex1++;
        }else if(x==3){
          
       // newtonXFX.setText("Enter the value for which function need calculate");
        data= Double.parseDouble(getXFX.getText());
         getXFX.setDisable(true);
        add3.setDisable(true);
         x=1;
        lagrangesOutput();
        }else if(x==4){
       // getXFX.setDisable(true);
        //add3.setDisable(true);
       // x=1;
        //lagrangesOutput();
    }
    }catch (NumberFormatException e) {
        error.setText("                     Invalid Input. Please Enter a Valid Integer.");
        getXFX.clear();

    }
}
private void lagrangesOutput(){

     newtonsCalculate = new Button("CALCULATE");
    newtonsCalculate.setPrefHeight(50.0);
    newtonsCalculate.setPrefWidth(200.0);
    newtonsCalculate.setFont(Font.font("Calibri bold", 21.0));
    AnchorPane.setLeftAnchor( newtonsCalculate, 150.0);
    AnchorPane.setRightAnchor( newtonsCalculate, 150.0);
    AnchorPane.setTopAnchor (newtonsCalculate, 430.0);
    AnchorPane.setBottomAnchor (newtonsCalculate, 310.0);
    centerAnchorPane.getChildren().addAll(newtonsCalculate);

    newtonsCalculate.setOnAction(event -> {
                     ansLabel3 = new Label("");
                    ansLabel3.setTextFill(Color.BLACK);
                    ansLabel3.setFont(Font.font("Calibri Bold", 20.0));
                    ansLabel3.setStyle("-fx-border-width:1.0; -fx-border-style: solid;");
                    AnchorPane.setBottomAnchor(ansLabel3, 250.0);
                    AnchorPane.setLeftAnchor(ansLabel3, 150.0);
                    AnchorPane.setRightAnchor(ansLabel3, 150.0);
                    AnchorPane.setTopAnchor(ansLabel3,500.0);
                    lagrangesFinal();
                                        
                });
}

private void lagrangesFinal(){

        centerAnchorPane.getChildren().addAll(ansLabel3);

    double Result =0;


	        for(int i=0; i<dataNum; i++) {

			double term = 1;

			for(int j=0; j<dataNum; j++) {

				if(i!=j){
                    term=term*((data-lagrangesArr1[j])/(lagrangesArr1[i]-lagrangesArr1[j]));
                }
			}

			Result=Result+(term*lagrangesArr2[i]);
        }

             ansLabel3.setText(""+Result);
             Result=0;


		
    }


    public static void main(String[] args) {
        launch(args);
    }
}
