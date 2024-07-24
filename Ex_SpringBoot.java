package com.example.demo;

public class Ex_SpringBoot {


    /*  ---- Q1-----
         output واحد :
     output :  hey from message1
            داخل جملة الطباعه
     */




    /*   ---Q2---
      راح يمشي على Qualifier المسج الثانيه تعتمد على الاولى
      ماراح يشغل الثانيه قبل مايتم تشغيل الاولى

       1-Output:  hey from massge1
                  hey from massge2

     */




    /*    -- Q3--

      Output: hey from message1
              hey from message3
              hey from message2



             Output: hey from message3
                    hey from message1
                    hey from message2



                Output: hey from message3
                        hey from message2
                        hey from message1


      الاحتمال الاول : تتنفذ الاولى لانها ماتحتوي على اعتماديه ثم تتنفذ الثلاثه لازم قبل2
     الاحتمال الثاني : تنتفذ ثلاثه لانها ماتعمد على شي ثم تتنفذ الاولى بعدها الثانيه الثانيه
        الاحتمال الثالث: يبدا التنفيذ بثلاثه لان مافيه تنبؤ وبالتالي قابل انو اثتين تتنفذ لانها تعتمد على ثلاثه ثم تتنقذ واحد

     */




    /*     --- Q4 ---

        1- output: hey from message1
                  hey from Main Controller
                  hey from message3
                  hey from message2

        2-  output: hey from message1
                  hey from message3
                  hey fom message2
                  hey from message main controller

      3-  output: hey fom message3
                hey from message2
                hey from message1
                hey fom main controller

     4-output:  hey from message3
                hey from message1
                hey from message2
                hey from main controller

      5- output:  hey from message3
                  hey from message1
                  hey from main controller
                  hey from message2

    6- output:    hey from message1
                  hey from message3
                  hey from message main controller
                  hey fom message2


         الاحتمال الاول انه بنفذ المسج 1 ثم الmaincontroller لانه يعتمد على 1
        بعدين بنفذ ثلاثه ثم ينفذ 2 لانها تعتمد على ثلاثه

         الاحتمال الثاني: انه ينفذ 1 ثم 3 لان مابينهم اولويه وبالتالي بينفذ 2 بعد 3
          بالاخير ينفذ الmaincontroller

           الاحتمال الثالث : يبدا ب3 ثم 2 لانها معتمده عليها ثم يبدا ب1
             وبعدها ال main controller لانها تعتمد على تنفيذ ال 1


  الاحتمال الرابع :تنفيذ المسج 3 ثم ينفذ 1 لان مابين اعتماديه بعدها ينفذ المسج2
   maincontroller ثم

              الاحتمال الخامس : يقوم بتنفيذ مسج 3 ثم مسج1
              بعدين يقوم بتنفيذ المسج المعتمده على المسج 1
              بعدها ينفذ المسج2 الي معتمده على ثلاثه

            الاحتمال السادس:يقوم بتنفيذ المسج 1 ثم المسج 3 لان مابينهم اولويه
           بعدها يوم بتنقيذ المسج المعتمد على الاولى ثم المسج2 المعتد على 3
     */



    /*   ---Q5----

       1- 1-output:  hey from message3
                     hey from message2
                     hey from main Controller
                     hey fom Message1

                    مسج3 لا تعتمد على شي وعندي مسج2 تعتمد على 3
                    ومسج main controller تعتمد على 2
                    ثم يقوم بتنفيذ مسج1


         2-output:  hey fom Message1
                    hey from message3
                     hey from message2
                     hey from main Controller
                       يقوم بتنفيذ مسج 1
                      ينفذ  مسج3 لا تعتمد على شي وعندي مسج2 تعتمد على 3
                      ومسج main controller تعتمد على 2


         3-output:   hey from message3
                     hey fom Message1
                     hey from message2
                     hey from main Controller



     */



}
