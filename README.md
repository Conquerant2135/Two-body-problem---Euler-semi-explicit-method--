# Two body problem
This is a simple simulation of a stellar object revolving around another by using the Euler semi-explicit method ( symplectic Euler ) 

# Formulae
## Law of gravitation
We need to use the Newton laws of gravitation . 
In the scalar form :

```math
F = G \frac{m_1 m_2}{d^2}
```

And the vectorial form :

```math
\vec{F}_{1,2} = G \frac{m_1 m_2}{\|\vec{r}_{1,2}\|^3} \vec{r}_{1,2}
```

We will use the vectorial form for the simulation . With the 2nd law of Newton , we can get the acceleration of any body of the system :

```math
\vec{F}_{1,2} = {m}_{1}\vec{a}_{1}
```

We have the same equation for the second body . 

From this equation we can get the experession of the acceleration of the body :

```math
\vec{a}_1 = G \cdot \frac{m_2}{\|\vec{r}_2 - \vec{r}_1\|^3} \cdot (\vec{r}_2 - \vec{r}_1)
```

We will note that the equation of the acceleration of the other body is the same as it but we just swap 1 by 2 for the body mass and position

## Euler semi-explicit method :
The semi-implicit Euler method, also called symplectic Euler, semi-explicit Euler, Euler–Cromer, and Newton–Størmer–Verlet (NSV) is a modification of the Euler method for solving Hamilton's equation , a system of differential equation .
The semi-implicit Euler method can be applied to a pair of differential equations of the form :

```math
  \frac{dx}{dt} = f(t,v)
```
```math
  \frac{dv}{dt} = g(t,x)
```
So we have the equations :

```math
  \vec{v}_{n+1} &= \vec{v}_n + \vec{a}_n \, \Delta t \\
```
```math
  \vec{x}_{n+1} &= \vec{x}_n + \vec{v}_{n+1} \, \Delta t
```
