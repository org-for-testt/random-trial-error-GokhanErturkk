
import subprocess

command= ["mvn", "test"]

p=subprocess.Popen(command,stdout=subprocess.PIPE, stderr=subprocess.STDOUT)

seen_Results = False
for line in iter(p.stdout.readline , b''):
    line = line.decode('utf-8')
    if line.startswith("Results :"):
        seen_Results = True
    if seen_Results and line.startswith("Tests run"):
        # print(line.strip())
        test_results = line.strip()
        print(test_results.split(','))

        
    # break