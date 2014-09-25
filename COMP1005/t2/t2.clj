(ns t2)

(defn -main [& args])

(defn multiply_list [a] (reduce * a))

(defn join_strings [a] (reduce str a))

(defn square [a] (map #(* % %) a))

(defn describe_seconds [s] 
	(cond 
		(< s 60) (str s " seconds")
		(< s 3600) (str (mod (quot s 60) 60) " minutes " (mod s 60) " and seconds")
		(< s 86400) (str (mod (quot (quot s 60) 60) 24) " hours," (mod (quot s 60) 60) " minutes " (mod s 60) " and seconds")
		:else "a long time"))

(println (multiply_list (range 1 5)))
(println (multiply_list (range 3 5)))
(println (multiply_list [1, 1, 1]))
(println (join_strings ["Hello", " ", "World!"]))
(println (join_strings ["Look ", "at ", "my ", "function!"]))
(println (square (range 5)))
(println (square [0,1,2,2,1,0]))
(println (describe_seconds 5))
(println (describe_seconds 70))
(println (describe_seconds 3700))
(println (describe_seconds 90000))