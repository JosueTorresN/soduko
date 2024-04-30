%Reglas necesarias para la validacion del juego
fila(List,I,Res):-
    J is 0,
    obtenerFilaAux(List,I,J,Res1),
    Res = Res1.

columna(List,J,Res):-
    I is 0,
    obtenerColumnaAux(List,I,J,Res1),
    Res = Res1.

diagonalP(List,Res):-
    Cont is 0,
    obtenerDiagonalPAux(List,Cont,Res1),
    Res = Res1.

diagonalI(List,Res):-
    I is 8,
    J is 0,
    obtenerDiagonalIAux(List,I,J,Res1),
    Res = Res1.

cuadrado(List,C,Res):-
    CI is C // 3,
    CJ is C mod 3,
    I is 3 * CI,
    J is 3 * CJ,
    cuadradoAux(List,I,J,I,J,Res1),
    Res = Res1,!.

obtenerFilaAux(_,_,J,Res) :- J == 9, Res = [],!.
obtenerFilaAux(Matriz,Fila,J,Res) :-
    I is Fila * 9,
    Posi is I + J,
    nth0(Posi,Matriz,Elem),L1 = [Elem],J1 is J + 1,obtenerFilaAux(Matriz,Fila,J1,Res1),append(L1,Res1,Res2),Res = Res2.

obtenerColumnaAux(_,Fila,_,Res) :- Fila == 9, Res = [],!.
obtenerColumnaAux(Matriz,Fila,J,Res) :-
    I is Fila * 9,
    Posi is I + J,
    nth0(Posi,Matriz,Elem),L1 = [Elem],I1 is Fila + 1,obtenerColumnaAux(Matriz,I1,J,Res1),append(L1,Res1,Res2),Res = Res2.

obtenerDiagonalPAux(_,Cont,Res) :- Cont == 9, Res = [],!.
obtenerDiagonalPAux(Matriz,Cont,Res) :-
    I is Cont * 9,
    Posi is I + Cont,
    nth0(Posi,Matriz,Elem),L1 = [Elem],Cont1 is Cont + 1,obtenerDiagonalPAux(Matriz,Cont1,Res1),append(L1,Res1,Res2),Res = Res2.

obtenerDiagonalIAux(_,_,J,Res) :- J == 9, Res = [],!.
obtenerDiagonalIAux(Matriz,Fila,J,Res) :-
    I is Fila * 9,
    Posi is I + J,
    nth0(Posi,Matriz,Elem),L1 = [Elem],I1 is Fila - 1,J1 is J + 1,obtenerDiagonalIAux(Matriz,I1,J1,Res1),append(L1,Res1,Res2),Res = Res2.

cuadradoAux(_,IOrig,_,I,_,Res):- Maximo is IOrig + 3,I == Maximo,Res = [],!.
cuadradoAux(List,IOrig,JOrig,I,J,Res):-  Maximo is JOrig + 3,J == Maximo,
    I1 is I+1,
    cuadradoAux(List,IOrig,JOrig,I1,JOrig,Res1),
    Res = Res1,!.
cuadradoAux(List,IOrig,JOrig,I,J,Res):-
    ITemp is I * 9,
    Posi is ITemp + J,
    nth0(Posi,List,Elem),
    J1 is J + 1,
    cuadradoAux(List,IOrig,JOrig,I,J1,Res1), L1 = [Elem],
    append(L1,Res1,Res2), Res = Res2,!.

validaFilas(_,Cont):- Cont == 9,!.
validaFilas(Lista,Cont):- fila(Lista,Cont,Res2),is_set(Res2), Cont1 is Cont + 1,validaFilas(Lista,Cont1).

validaColumna(_,Cont):- Cont == 9,!.
validaColumna(Lista,Cont):- columna(Lista,Cont,Res2),is_set(Res2), Cont1 is Cont + 1,validaColumna(Lista,Cont1).

validaDiagonales(Lista):- diagonalP(Lista,Res),is_set(Res),diagonalI(Lista,Res2),is_set(Res2).

validaCuadrado(_,C):- C == 9,!.
validaCuadrado(Lista,C):- cuadrado(Lista,C,Res2),is_set(Res2), C1 is C + 1, validaCuadrado(Lista,C1).

validaciones(Lista):- not(member(0,Lista)),Cont is 0,validaFilas(Lista,Cont),validaColumna(Lista,Cont),validaDiagonales(Lista),validaCuadrado(Lista,Cont).
%Fin de las reglas de validacion

%Verifica si una posicion es parte de la diagonal del tablero
isDiagonalP(I,J) :-  I == J,!.

%Verifica si una posicion es parte de la antidiagonal del tablero
isDiagonalI(I,J) :-  Suma is I+J,Suma == 8,!.

%Esta regla muestra los numeros que faltan en una fila del tablero
numerosFaltantes(_,I,J,Res):- I == 9, Res = [];J == 9, Res =[],!.
numerosFaltantes(M,I,J,Res):- isDiagonalP(I,J),isDiagonalI(I,J),
    fila(M,I,Fila),
    columna(M,J,Columna),
    diagonalP(M,DiagonalP),
    diagonalI(M,DiagonalI),
    CI is I // 3,
    CJ is J // 3,
    C is (CI * 3) + CJ,
    cuadrado(M,C,Cuadrado),
    ListaN = [1,2,3,4,5,6,7,8,9],
    numerosFaltantesAux(Fila,ListaN,FaltFi),
    numerosFaltantesAux(Columna,ListaN,FaltCo),
    numerosFaltantesAux(DiagonalP,ListaN,FaltDp),
    numerosFaltantesAux(DiagonalI,ListaN,FaltDi),
    numerosFaltantesAux(Cuadrado,ListaN,FaltCu),
    ord_intersection(FaltFi,FaltCo,ResFiCo),
    ord_intersection(FaltDp,FaltCu,ResDpCu),
    ord_intersection(ResFiCo,ResDpCu,ResFCD),
    ord_intersection(FaltDi,ResFCD,Res1),
    Res = Res1,!.

numerosFaltantes(M,I,J,Res):- isDiagonalP(I,J),not(isDiagonalI(I,J)),
    fila(M,I,Fila),
    columna(M,J,Columna),
    diagonalP(M,DiagonalP),
    CI is I // 3,
    CJ is J // 3,
    C is (CI * 3) + CJ,
    cuadrado(M,C,Cuadrado),
    ListaN = [1,2,3,4,5,6,7,8,9],
    numerosFaltantesAux(Fila,ListaN,FaltFi),
    numerosFaltantesAux(Columna,ListaN,FaltCo),
    numerosFaltantesAux(DiagonalP,ListaN,FaltDp),
    numerosFaltantesAux(Cuadrado,ListaN,FaltCu),
    ord_intersection(FaltFi,FaltCo,ResFiCo),
    ord_intersection(FaltDp,FaltCu,ResDpCu),
    ord_intersection(ResFiCo,ResDpCu,Res1),
    Res = Res1,!.
numerosFaltantes(M,I,J,Res):- isDiagonalI(I,J),not(isDiagonalP(I,J)),
    fila(M,I,Fila),
    columna(M,J,Columna),
    diagonalI(M,DiagonalI),
    CI is I // 3,
    CJ is J // 3,
    C is (CI * 3) + CJ,
    cuadrado(M,C,Cuadrado),
    ListaN = [1,2,3,4,5,6,7,8,9],
    numerosFaltantesAux(Fila,ListaN,FaltFi),
    numerosFaltantesAux(Columna,ListaN,FaltCo),
    numerosFaltantesAux(DiagonalI,ListaN,FaltDI),
    numerosFaltantesAux(Cuadrado,ListaN,FaltCu),
    ord_intersection(FaltFi,FaltCo,ResFiCo),
    ord_intersection(FaltDI,FaltCu,ResDpCu),
    ord_intersection(ResFiCo,ResDpCu,Res1),
    Res = Res1,!.

numerosFaltantes(M,I,J,Res):- not(isDiagonalP(I,J)),not(isDiagonalI(I,J)),
    fila(M,I,Fila),
    columna(M,J,Columna),
    CI is I // 3,
    CJ is J // 3,
    C is (CI * 3) + CJ,
    cuadrado(M,C,Cuadrado),
    ListaN = [1,2,3,4,5,6,7,8,9],
    numerosFaltantesAux(Fila,ListaN,FaltFi),
    numerosFaltantesAux(Columna,ListaN,FaltCo),
    numerosFaltantesAux(Cuadrado,ListaN,FaltCu),
    ord_intersection(FaltFi,FaltCo,ResFiCo),
    ord_intersection(ResFiCo,FaltCu,Res1),
    Res = Res1,!.

numerosFaltantesAux([],ListaN,Res):- Res = ListaN,!.
numerosFaltantesAux([HL|TL],ListaN,Res):- selectchk(HL,ListaN,Res1),numerosFaltantesAux(TL,Res1,Res2),Res = Res2,!.
numerosFaltantesAux([HL|TL],ListaN,Res):- not(selectchk(HL,ListaN,_)),numerosFaltantesAux(TL,ListaN,Res2),Res = Res2,!.

%Reemplaza el valor de una posicion especifica del tablero por otra
reemplazarPosicion([_|TL],I,Cont,Elem,Res):- I == Cont,append([Elem],TL,Res1),Res = Res1,!.
reemplazarPosicion([HL|TL],I,Cont,Elem,Res):- Cont1 is Cont + 1,reemplazarPosicion(TL,I,Cont1,Elem,Res1),append([HL],Res1,Res2),Res = Res2,!.

% Cuenta la cantidad de numeros colocados en la posicion incorrecta del
% tablero
contarErrores([],_,0):- !.
contarErrores([HM|TM],[HMC|TMC],Res):- not(HM == 0),not(HM == 10),not(HM==HMC),contarErrores(TM,TMC,Res1),Res is Res1 + 1,!.
contarErrores([_|TM],[_|TMC],Res):- contarErrores(TM,TMC,Res1),Res is Res1,!.

%Cuenta la cantidad de espacios vacios que posee el tablero
contarVacios([],0):- !.
contarVacios([HM|TM],Res):- HM == 0, contarVacios(TM,Res1),Res is Res1 + 1,!.
contarVacios([_|TM],Res):- contarVacios(TM,Res1),Res is Res1,!.

% Cuenta la cantidad de numero colocados en la posicion correcta del
% tablero
contarCorrectas([],_,0):- !.
contarCorrectas([HM|TM],[HMC|TMC],Res):- not(HM == 0),HM==HMC,contarCorrectas(TM,TMC,Res1),Res is Res1 + 1,!.
contarCorrectas([_|TM],[_|TMC],Res):- contarCorrectas(TM,TMC,Res1),Res is Res1,!.

%Obtiene una lista con todas las posiciones incorrectas o falltantes
sugerenciaAux(_,_,Cont,Res):-Cont == 81, Res = [],!.
sugerenciaAux(MatrizActual,MatrizCorrecta,Cont,Res):-nth0(Cont,MatrizActual,ElemMA), nth0(Cont,MatrizCorrecta,ElemMC),not(ElemMA == ElemMC), Cont1 is Cont + 1, sugerenciaAux(MatrizActual, MatrizCorrecta, Cont1,Res1), append([Cont],Res1,Res2), Res = Res2,!.
sugerenciaAux(MatrizActual,MatrizCorrecta,Cont,Res):-Cont1 is Cont + 1, sugerenciaAux(MatrizActual, MatrizCorrecta, Cont1,Res1), Res = Res1,!.

crearMatrizAux(Matriz,I,_,_,Res):- I == 9,
    Res = Matriz,!.
crearMatrizAux(Matriz,I,J,_,Res):- J == 9,
    I1 is I + 1,
    J2 is 0,
    numerosFaltantes(Matriz,I1,J2,NF1),
    crearMatrizAux(Matriz,I1,0,NF1,Res1),
    Res = Res1,!.
crearMatrizAux(_,_,_,[],Res):- Res = [],
    !.
crearMatrizAux(Matriz,I,J,NFaltantes,Res):-
    obtenerNumero(NFaltantes,Numero),
    Posi is (I*9)+J,
    reemplazarPosicion(Matriz,Posi,0,Numero,Matriz1),
    J1 is J + 1,
    numerosFaltantes(Matriz1,I,J1,NF1),
    crearMatrizAux(Matriz1,I,J1,NF1,Res1),
    selectchk(Numero,NFaltantes,NF),
    verificarMatrizVacia(Res1,Matriz,I,J,NF,Res3),
    Res = Res3,!.

% Verifica si la matriz esta vacia, de ser asi llama a crearMatrix aux
% nuevamente y retorna lo que de la llamada, en caso contrario retorna
% la matriz
verificarMatrizVacia([],Matriz,I,J,NF,Res):- crearMatrizAux(Matriz,I,J,NF,Res2),Res = Res2,!.
verificarMatrizVacia(Matriz1,_,_,_,_,Res):- Res = Matriz1,!.

% Obtiene un numero aleatorio de una lista, en el caso de ser un vacio
% devuelve 0.
obtenerNumero([],Res):- Res is 0,!.
obtenerNumero(Lista,Res):-
    random_member(Num,Lista),
    Res is Num,!.

% Seleciona una posicion con un valor incorrecto aleatoria y lo
% reemplaza por el valor correcto
sugerencia(MatrizActual,MatrizCorrecta,Res):- Cont is 0,
    sugerenciaAux(MatrizActual,MatrizCorrecta,Cont,List),
    random_member(Numero,List),
    nth0(Numero,MatrizCorrecta,ElemMC),
    reemplazarPosicion(MatrizActual,Numero,0,ElemMC,Res1),
    Res = Res1,!.


% Verifica si hay gane, si se cumple con todas las validaciones y cuenta
% la cantidad de errores, espacios vacios y cantidad de asiertos.
verificar(Matriz,_,Res):- validaciones(Matriz),Res = [],!.
verificar(Matriz,MatrizCompleta,Res):- not(validaciones(Matriz)),
    contarErrores(Matriz,MatrizCompleta,Errores),
    contarCorrectas(Matriz,MatrizCompleta,Correctas),
    contarVacios(Matriz,Vacias),
    Res = [Errores,Vacias,Correctas],!.

% Crea una matriz valida a partir de la cual se da inicio a una partida
crearMatriz(Res):-
    I is 0,
    J is 0,
    Lista = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
    numerosFaltantes(Lista,I,J,NFaltantes),
    crearMatrizAux(Lista,I,J,NFaltantes,Res1),
    Res = Res1,!.