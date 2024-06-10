
import matplotlib.pyplot as plt
from math import *   

def graphe(f, a=-1, b=3, N=50):
    '''ça trace le graphe de f sur [a,b] avec N points'''
    
    lx = [a+i*(b-a)/N for i in range(N)]
    ly = [f(x) for x in lx]
    plt.plot(lx, ly, 'blue')
   
    # Pour les axes et la grille 
    plt.axhline(color = 'k')
    plt.axvline(color = 'k')
    plt.grid()

    titre = "graphe de $f:x\mapsto x^3-3x+1$"
    plt.title(titre)
    # on affiche 
    plt.show()


def phi(x):
    return 1/3 * (x**3+1)

def phi_prime(x):
    return x**2 

def nature(x):
    if abs(phi_prime(x)) > 1:
        print(f"La valeur absolue de dérivée du point {x} est > 1")
    elif abs(phi_prime(x)) < 1:
        print(f"La valeur absolue de dérivée du point {x} est < 1")
    else:
        print(f"On ne peut rien déduire")


def phi2(x):
    return sqrt(3-1/x)

def phi3(x):
    return -sqrt(3-1/x)


def point_fixe(x,gt):
    a  : float = x
    while (abs(g(a))>10**-12):
         a=gt(a)
    print(f"Le point fixe au voisinage de {x} est {a}")


def Euler(y0:float, n:int, f, a:int, b:int):
  x0 : float = a
  h : float = (b-a)/n
  #On utilise les listes au lieu d'un tableau
  listex = [x0]
  listey = [y0]

  for i in range (n):
    y0 += h*f(x0, y0)
    x0 += h
    listex.append(x0)
    listey.append(y0)
    
  return listex, listey


def graphe (n):
    A = Euler(1, n, f, 0, 1)
    listex = A[0]
    listey = A[1]
    plt.plot(listex,listey)
    listex2 =[i/100 for i in range (100) ]
    listey2 =[g(x) for x in listex2]
    plt.plot(listex2, listey2)
    plt.show


def Riemann(h,a,b,n):
  Rn = 0
  for k in range(0,n):
    Rn += h(a+k*(b-a)/n)
  Rn *= (b-a)/n
  return Rn

def graphe2(n):
  for i in range (11):
    A = Euler(i, n, f, 0, 1)
    listex = A[0]
    listey = A[1]
    plt.plot(listex, listey)
  plt.show