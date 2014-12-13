import System.IO

(//) a b = a `div` b

f2c :: Float -> Float
f2c t = ((t - 32) * 5 / 9)

lboz2kg :: Float -> Float -> Float
lboz2kg p o = (((p * 16) + o) / 35.274)

in2ftin :: Int -> (Int, Float)
in2ftin h
    | h < 12 = (0, fromIntegral h)
    | otherwise = (h // 12, ((fromIntegral h / 12) - fromIntegral(h // 12)) * 10)

bibformat_mla :: String -> String -> String -> String -> String -> String
bibformat_mla author title city publisher year = author ++ ". " ++ title ++ ". " ++ city ++ ": " ++ publisher ++ ", " ++ year

bibformat_apa :: String -> String -> String -> String -> String -> String
bibformat_apa author title city publisher year = author ++ " (" ++ year ++ "). " ++ title ++ ". " ++ city ++ ": " ++ publisher ++ "."

bmi :: Float -> Float -> Float
bmi w h = (w / (h * h)) * 703

prompt :: String -> IO String
prompt text = do
    putStr text
    hFlush stdout
    getLine

bmi_calculator :: IO ()
bmi_calculator = do
    name <- prompt "name: "
    weight <- prompt "Enter weight: "
    height <- prompt "Enter height: "
    putStrLn $ "Looks like " ++ name ++ "'s BMI is " ++ show (bmi (read $ weight :: Float) (read $ height :: Float))

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
    bmi_calculator