(//) a b = a `div` b
(%) a b = a `mod` b

kilometers2miles :: Float -> Float
kilometers2miles d = d * 0.62137

circumference :: Float -> Float
circumference r = (2 * 3.1415) * r

average :: Float -> Float -> Float
average x y = (x + y) / 2

greet :: String -> IO()
greet name = putStrLn $ "Hi, " ++ name

s2dhms :: Int -> (Int, Int, Int, Int)
s2dhms t = ((((t // 60) // 60) // 24), (((t // 60) // 60) % 24), ((t // 60) % 60), (t % 60))

dhms2s :: Int -> Int -> Int -> Int -> Int
dhms2s d h m s = ((((d * 24) * 60) * 60) + ((h * 60) * 60) + (m * 60) + s)

main :: IO()
main = do
	putStrLn $ show $ kilometers2miles 3
	putStrLn $ show $ circumference 2
	putStrLn $ show $ average 1 3
	greet "Bob"
	putStrLn $ show $ s2dhms 90061
	putStrLn $ show $ dhms2s 1 2 3 4