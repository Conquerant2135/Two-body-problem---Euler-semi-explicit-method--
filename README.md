# Two body problem
This is a simple simulation of a stellar object revolving around another by using the Euler semi-explicit method ( symplectic Euler ) 

# Formulae
## Law of gravitation
We need to use the Newton laws of gravitation . 
In the scalar form :

```math
F = G \frac{m_1 m_2}{r^2}
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
