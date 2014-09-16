(ns a1)

(defn -main [& args])

(defn f2c [t]
	(float (* (- t 32) (/ 5 9))))

(println "f2c" (f2c 80))
(println "f2c" (f2c 100))
(println "f2c" (f2c 300))

(defn lboz2kg 
	([p] (float (/ (+ (* p 16) 0) 35.274)))
	([p o] (float (/ (+ (* p 16) o) 35.274))))

(println "lboz2kg" (lboz2kg 2.2047))
(println "lboz2kg" (lboz2kg 50 80))
(println "lboz2kg" (lboz2kg 10 100))

(defn in2ftin [h]
	(if (< h 12) 
		[0 h] 
		[(int (/ h 12)) (int (* (- (float (/ h 12)) (int (/ h 12))) 10))]
	))

(println "in2ftin" (in2ftin 12))
(println "in2ftin" (in2ftin 120))
(println "in2ftin" (in2ftin 150))
(println "in2ftin" (in2ftin 235))
(println "in2ftin" (in2ftin 5))

(defn bibformat_mla [author title city publisher year]
	(str author ". " title ". " city ": " publisher ", " year))

(println "bibformat_mla" (bibformat_mla "Randall Munroe" "what if?" "New York" "Houghton Mifflin Hardcourt" 2014))
(println "bibformat_mla" (bibformat_mla "J. R. R. Tolkien" "The Hobbit" "London" "Unwin Paperbacks" "1981"))

(defn bibformat_apa [author title city publisher year]
	(str author " (" year "). " title ". " city ": " publisher "."))

(println "bibformat_apa" (bibformat_apa "Randall Munroe" "what if?" "New York" "Houghton Mifflin Hardcourt" 2014))
(println "bibformat_apa" (bibformat_apa "J. R. R. Tolkien" "The Hobbit" "London" "Unwin Paperbacks" "1981"))

(defn bmi [w h]
	(float (* (/ w (* h h)) 703)))

(println "bmi", (bmi 180 70))
(println "bmi", (bmi 500 200))
(println "bmi", (bmi 99 80))

(defn bmi_calculator [] 
	(defn prompt [prompt]
		(print (format "%s: " prompt))
		(flush )
		(read-line))
	(def fname (prompt "name"))
	(def weight (read-string (prompt "weight"))) ;read-string converts the input to an int
	(def height (read-string (prompt "height")))
	(println "Looks like " fname "'s BMI is " (bmi weight height)))

(bmi_calculator)