f2c t = ((t - 32) * 5 / 9)

lboz2kg p o = (((p * 16) + o) / 35.274)

in2ftin h = if h < 12 
    then [0, h] 
    else [ft, inch]
    where {
        ft = h / 12;
        inch = h - (h / 12); --this is just horribly broken D:
    }

bibformat_mla author title city publisher year = author ++ ". " ++ title ++ ". " ++ city ++ ": " ++ publisher ++ ", " ++ year

bibformat_apa author title city publisher year = author ++ " (" ++ year ++ "). " ++ title ++ ". " ++ city ++ ": " ++ publisher ++ "."

bmi w h = (w / (h * h)) * 703

--bmi_calculator name w h = "looks like " ++ name ++ "'s bmi is " ++ bmi' where bmi' = show(bmi w h)

readInt :: IO Int
readInt = do
        s <- getLine
        return(read s)

putInt :: Int -> IO()
putInt n = do putStr(show n)

main :: IO ()
main = do
    print ("f2c: " ++ (show (f2c 80)))
    print ("f2c: " ++ (show (f2c 100)))
    print ("f2c: " ++ (show (f2c 300)))
    print ("lboz2kg " ++ (show (lboz2kg 2.2047 0)))
    print ("lboz2kg " ++ (show (lboz2kg 50 80)))
    print ("lboz2kg " ++ (show (lboz2kg 10 100)))
    print ("in2ftin " ++ (show (in2ftin 12)))
    print ("in2ftin " ++ (show (in2ftin 120)))
    print ("in2ftin " ++ (show (in2ftin 150)))
    print ("in2ftin " ++ (show (in2ftin 235)))
    print ("in2ftin " ++ (show (in2ftin 5)))
    print ("bibformat_mla " ++ (bibformat_mla "Randall Munroe" "what if?" "New York" "Houghton Mifflin Hardcourt" "2014"))
    print ("bibformat_mla " ++ (bibformat_mla "J. R. R. Tolkien" "The Hobbit" "London" "Unwin Paperbacks" "1981"))
    print ("bibformat_apa " ++ (bibformat_apa "Randall Munroe" "what if?" "New York" "Houghton Mifflin Hardcourt" "2014"))
    print ("bibformat_apa " ++ (bibformat_apa "J. R. R. Tolkien" "The Hobbit" "London" "Unwin Paperbacks" "1981"))
    print ("bmi " ++ (show (bmi 180 70)))
    print ("bmi " ++ (show (bmi 500 200)))
    print ("bmi " ++ (show (bmi 99 80)))
    let test = readInt
    --test2 <- read
    putInt test
    --let bmiout = bmi test test2
    --print bmiout
    --print ("Name weight and height");
    --name <- getLine;
    --weight <- getLine
    --let height = 100
    --    bmioutput = bmi weight height
    --print bmioutput