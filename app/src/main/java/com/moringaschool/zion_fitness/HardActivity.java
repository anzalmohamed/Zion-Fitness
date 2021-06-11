package com.moringaschool.zion_fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HardActivity extends AppCompatActivity {

    private Button day1;
    private Button day2,day3,day4,day5,day6,day7,day8,day9,day10,day11,day12,day13,day14,day15,day16,day17,day18,day19,day20,day21,day22,day23,day24,day25,day26,day27,day28,day29,day30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);


//        day1=findViewById(R.id.day1);

        day1 = findViewById(R.id.day1);
        day7 = findViewById(R.id.day7);
        day13 = findViewById(R.id.day13);
        day19 = findViewById(R.id.day19);
        day25 = findViewById(R.id.day26);
        day2 = findViewById(R.id.day2);
        day8 = findViewById(R.id.day8);
        day14 = findViewById(R.id.day14);
        day20 = findViewById(R.id.day20);
        day26 = findViewById(R.id.day27);
        day3 = findViewById(R.id.day3);
        day9 = findViewById(R.id.day9);
        day15 = findViewById(R.id.day15);
        day21 = findViewById(R.id.day21);
        day27 = findViewById(R.id.day26);
        day4 = findViewById(R.id.day4);
        day10 = findViewById(R.id.day10);
        day16 = findViewById(R.id.day16);
        day22 = findViewById(R.id.day22);
        day28 = findViewById(R.id.day27);
        day5 = findViewById(R.id.day5);
        day11 = findViewById(R.id.day11);
        day17 = findViewById(R.id.day17);
        day23 = findViewById(R.id.day23);
        day29 = findViewById(R.id.day29);
        day6 = findViewById(R.id.day5);
        day12 = findViewById(R.id.day12);
        day18 = findViewById(R.id.day18);
        day24 = findViewById(R.id.day24);
        day30 = findViewById(R.id.day30);


        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HardActivity.this, Day1Activity.class));
            }
        });


//        day2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day2Activity.class));
//            }
//        });
//
//
//        day3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day3Activity.class));
//            }
//        });
//
//        day4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day4Activity.class));
//            }
//        });
//
//        day5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day5Activity.class));
//            }
//        });
//
//        day6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day6Activity.class));
//            }
//        });
//
//
//        day7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day7Activity.class));
//            }
//        });
//
//        day8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day8Activity.class));
//            }
//        });
//
//        day9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day9Activity.class));
//            }
//        });
//
//        day10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day10Activity.class));
//            }
//        });
//
//        day11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day11Activity.class));
//            }
//        });
//
//        day12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day12Activity.class));
//            }
//        });
//
//        day12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day12Activity.class));
//            }
//        });
//
//        day13.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day13Activity.class));
//            }
//        });
//
//        day14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day14Activity.class));
//            }
//        });
//
//        day15.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day15Activity.class));
//            }
//        });
//
//        day16.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day16Activity.class));
//            }
//        });
//
//        day17.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day17Activity.class));
//            }
//        });
//
//        day18.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day18Activity.class));
//            }
//        });
//
//        day19.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day19Activity.class));
//            }
//        });
//
//
//        day20.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day20Activity.class));
//            }
//        });
//
//        day21.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day21Activity.class));
//            }
//        });
//
//        day22.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day22Activity.class));
//            }
//        });
//
//        day23.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day23Activity.class));
//            }
//        });
//
//        day24.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day24Activity.class));
//            }
//        });
//
//        day25.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day25Activity.class));
//            }
//        });

//        day26.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day26Activity.class));
//            }
//        });
//
//
//        day27.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day27Activity.class));
//            }
//        });
//
//        day28.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day28Activity.class));
//            }
//        });
//
//        day29.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day29Activity.class));
//            }
//        });
//        day30.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HardActivity.this,Day30Activity.class));
//            }
//        });

    }



    public static class Day1Activity extends AppCompatActivity {
        private Button mworkout;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_day1);
            mworkout=findViewById(R.id.workout);
            mworkout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(Day1Activity.this, Workout1Activity.class);
                    startActivity(intent);
                    finish();
                }
            });

        }
    }
//
//    public static class Day2Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day2);
//        }
//    }
//
//    public static class Day3Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day3);
//        }
//    }
//
//    public static class Day4Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day4);
//        }
//    }
//
//    public static class Day5Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day5);
//        }
//    }
//
//    public static class Day6Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day6);
//        }
//    }
//
//    public static class Day7Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day7);
//        }
//    }
//
//    public static class Day8Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day8);
//        }
//    }
//
//    public static class Day9Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day9);
//        }
//    }
//
//    public static class Day10Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day10);
//        }
//    }
//
//    public static class Day11Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day11);
//        }
//    }
//
//    public static class Day12Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day12);
//        }
//    }
//
//    public static class Day13Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day13);
//        }
//    }
//
//    public static class Day14Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day14);
//        }
//    }
//
//    public static class Day15Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day15);
//        }
//    }
//
//    public static class Day16Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day16);
//        }
//    }
//
//    public static class Day17Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day17);
//        }
//    }
//
//    public static class Day18Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day18);
//        }
//    }
//
//    public static class Day19Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day19);
//        }
//    }
//
//    public static class Day20Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day20);
//        }
//    }
//
//    public static class Day21Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day21);
//        }
//    }
//
//    public static class Day22Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day22);
//        }
//    }
//
//    public static class Day23Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day23);
//        }
//    }
//
//    public static class Day24Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day24);
//        }
//    }

//    public static class Day25Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day25);
//        }
//    }
//
//    public static class Day26Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day26);
//        }
//    }
//
//    public static class Day27Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day27);
//        }
//    }
//
//    public static class Day28Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day28);
//        }
//    }
//
//    public static class Day29Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day29);
//        }
//    }
//
//    public static class Day30Activity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_day30);
//        }
//    }
}