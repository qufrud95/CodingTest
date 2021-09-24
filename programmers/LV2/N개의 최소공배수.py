
def GCD(A,B):
    if B == 0 :
        return A 
    else:
        return GCD(B,A%B)

        
def solution(arr):

    
    for i in range(len(arr)-1):
        if len(arr)==1: 
            break
        
        else :
            #print(arr[0],arr[1])
            gcd = GCD(arr[0],arr[1])
            #print("gcd : ",gcd)
            lcm = (arr[0]*arr[1])//gcd
            #print("lcm : ",lcm)
            arr.append(lcm)
            del(arr[0])
            del(arr[0])
            #print(arr,"\n\n")
    return arr[0]
    

if __name__ =="__main__":


    arr = [1,2,3]
    print(solution(arr))
    
