#!/usr/bin/env python
# coding: utf-8

# In[1]:



import math
import time


# In[2]:


def iteration (n) :
    #Reverse number and add
    
    r=0
    d = math.floor(math.log(n,10))+1
    
    for i in range(1,d+1) :
        r+=(n%10**i-n%10**(i-1))*10**(d-2*i+1)
        
    return int(n+r)  

def is_palin (n) :
    #Checks if the number is palindromic
    
    palin = True
    
    s = str(n)
    l = len(s)
    r = math.floor(l/2)
    
    for i in range(r):
        if s[i] != s[l-i-1] : 
            palin = False

    return (palin)

def test (n) :
    #Checks if the number if Lychrel i.e. doesn't produce a palindrome below 51 iterations
    
    p = n
    not_found = True
    c = 0
    
    while not_found and c<51 :
        p = iteration(p)
        not_found = not is_palin(p)
        c+=1
        
    return not_found


# In[3]:


St = time.time()

Lychrel = []

for n in range(1,10001) :
    if test(n) : Lychrel.append(n)
        
Et = time.time() - St

print(len(Lychrel), Et)


# In[4]:


Lychrel


# In[ ]:





# In[ ]:




